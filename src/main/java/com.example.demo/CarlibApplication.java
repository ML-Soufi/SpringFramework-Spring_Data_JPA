package com.example.demo;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.service.CategoryServicce;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class CarlibApplication implements CommandLineRunner {

	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryServicce categoryService;

	public static void main(String[] args) {
		SpringApplication.run(CarlibApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		// Category testiong and @ManyToMany
//		Optional<Category> optCategory = categoryService.getCategoryById(1);
//		Category category;
//		category = optCategory.get();
//		System.out.println(category.getNom());
//		List<Product> products = category.getProducts();
//		products.forEach(product -> System.out.println("* "+product.getName()));
		// Product testiong & @OneToMany
		//Iterable<Product> products = productService.listProducts();
		//products.forEach(product -> System.out.println(product.getName()));
		System.out.println("----------------------------------------------------------------");
		//Optional<Product> prc = productService.getProductById(2);
		//Product newProduct = prc.get();
		//System.out.println("- Id : "+newProduct.getProductId()+" , nom : "+newProduct.getName()+", description : "+newProduct.getDescription()+", cout :"+newProduct.getCost());
		//List<Comment> comments = newProduct.getComments();
		//comments.forEach(comment -> System.out.println(comment.getContenu()));
//		Optional<Product> prc = productService.getProductById(2);
//		Product newProduct = prc.get();
//		System.out.println("- Id : "+newProduct.getProductId()+" , nom : "+newProduct.getName()+", description : "+newProduct.getDescription()+", cout :"+newProduct.getCost());
//		List<Category> categories = newProduct.getCategories();
//		categories.forEach(category1 -> System.out.println("- "+category1.getNom()));
		//CRUD Operation
//		Category newCategory = new Category();
//		newCategory.setNom("Promotion");
//		newCategory = categoryService.addCategory(newCategory);

		//Product product = new Product();
		//product.setName("AssuranceTotal");
		//product.setDescription("cette assurance couvre tous...");
		//product.setCost(4900);

		//product = productService.addProduct(product);

		//System.out.println("the new product id is : "+product.getProductId());


	}
}
