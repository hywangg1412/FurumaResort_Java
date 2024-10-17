package Repository;

import Model.Customer;

import java.util.TreeSet;

public interface IPromotionRepository extends Repository<Customer, TreeSet<Customer>>{
    final String promotionPath = "\\Data\\promotion.csv";

    public TreeSet<Customer> readFile();

    public void writeFile(TreeSet<Customer> customers);
}
