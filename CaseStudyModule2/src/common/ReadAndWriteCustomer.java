package common;

import models.Customer;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomer {
    public List<Customer> readFile() {
        List<Customer> customerList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("D:\\C0321G1_NguyenDinhSonTra_Module_2\\CaseStudyModule2\\src\\data\\customer.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split("#");
                Customer customer = new Customer(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6],strings[7],strings[8]);
                customerList.add(customer);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }finally {
            try{
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return customerList;
    }

    public void writeFile(List<Customer> customerList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("D:\\C0321G1_NguyenDinhSonTra_Module_2\\CaseStudyModule2\\src\\data\\customer.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.toString());
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
