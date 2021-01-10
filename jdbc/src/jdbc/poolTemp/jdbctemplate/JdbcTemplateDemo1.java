package jdbc.poolTemp.jdbctemplate;


import jdbc.poolTemp.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * JdbcTemplate入门
 */
public class JdbcTemplateDemo1 {

    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update account set balance = 5050 where id = ?";
//        String sql = "update account set balance = 500";
        int count = template.update(sql,1);
        System.out.println(count);
    }
}
