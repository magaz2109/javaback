package lesson6;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class ExampleTestMain {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        lesson6.db.dao.CategoriesMapper categoriesMapper = sqlSession.getMapper(lesson6.db.dao.CategoriesMapper.class);
        lesson6.db.model.CategoriesExample categoriesExample = new lesson6.db.model.CategoriesExample();

        categoriesExample.createCriteria().andIdEqualTo(1L);


        lesson6.db.model.Categories selected = categoriesMapper.selectByPrimaryKey(2L);
        System.out.println("ID: " + selected.getId() + "\ntitle: " + selected.getTitle());

    }

}
