package lesson6;

import lesson6.db.dao.ProductsMapper;
import lesson6.db.model.CategoriesExample;
import lesson6.db.model.Products;
import lesson6.db.model.ProductsExample;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        MyBatisDbService dbService = new MyBatisDbService();
        ProductsMapper mapper = dbService.getProductsMapper();

        Products product = mapper.selectByPrimaryKey(1L);
        System.out.println(product);

        ProductsExample example = new ProductsExample();
        example.createCriteria()
                .andPriceLessThan(1000);

        List<Products> products = mapper.selectByExample(example);
        System.out.println(products);
        example.clear();

        CategoriesExample example1 = new CategoriesExample();
        example.createCriteria()
                .andCategoryIdLessThan(2L);
        List<Products> products1 = mapper.selectByExample(example);

        System.out.println(products1);
        example.clear();

        mapper.insert(new Products(6L, "Test", 777, 1L));
    }
}
