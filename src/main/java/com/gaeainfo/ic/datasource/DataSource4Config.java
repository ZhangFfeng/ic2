package com.gaeainfo.ic.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by summer on 2016/11/25.
 */
@EnableTransactionManagement//重要
@Configuration
@MapperScan(basePackages = "com.gaeainfo.ic.mapper.mapper4", sqlSessionTemplateRef = "forthSqlSessionTemplate")
public class DataSource4Config {

    @Bean(name = "forthDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.forth")
    public HikariDataSource testDataSource4() {
        return new HikariDataSource();
    }

    @Bean(name = "forthSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("forthDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/OracleJcjAjxxMapper.xml"));
        return bean.getObject();
    }

    @Bean(name = "forthTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("forthDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "forthSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("forthSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }


}
