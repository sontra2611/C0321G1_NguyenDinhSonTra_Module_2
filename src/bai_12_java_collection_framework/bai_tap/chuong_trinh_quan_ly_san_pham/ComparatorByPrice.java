package bai_12_java_collection_framework.bai_tap.chuong_trinh_quan_ly_san_pham;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() > o2.getPrice()){
            return -1;
        }else if(o1.getPrice() == o2.getPrice()){
            return 0;
        }else{
            return 1;
        }
    }
}
