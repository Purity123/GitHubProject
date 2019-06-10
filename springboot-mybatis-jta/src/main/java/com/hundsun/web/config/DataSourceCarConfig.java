package com.hundsun.web.config;

import com.alibaba.druid.pool.xa.DruidXADataSource;
import com.atomikos.jdbc.AtomikosDataSourceBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2017/3/26/026.
 * 数据源配置
 */
@Configuration
@MapperScan(basePackages = {"com.hundsun.web.mapper.car*"}, sqlSessionTemplateRef = "sqlSessionTemplateCar") // 扫描dao或mapper接口
public class DataSourceCarConfig {

    @Primary
    @Bean(name = "dataSourceCar")
    public DataSource dataSourceCar(DataSourceCarProperties dataSourceCarProperties){
        DruidXADataSource dataSource = new DruidXADataSource();
        BeanUtils.copyProperties(dataSourceCarProperties,dataSource);
        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(dataSource);
        xaDataSource.setUniqueResourceName("dataSourceCar");
        return xaDataSource;
    }


    @Bean(name = "sqlSessionFactoryCar")
    public SqlSessionFactory sqlSessionFactoryCar(@Qualifier("dataSourceCar") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setTypeAliasesPackage("com.hundsun.web.entity.car");
        return bean.getObject();
    }

    @Bean(name = "sqlSessionTemplateCar")
    public SqlSessionTemplate sqlSessionTemplateCar(
            @Qualifier("sqlSessionFactoryCar") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
