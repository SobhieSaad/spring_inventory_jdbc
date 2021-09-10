
package test;

import com.dao.OrderDetailsDao;
import com.entity.OrderDetails;

/**
 *
 * @author Sobhie
 */
public class Test {
    public static void main(String[] args) {
        OrderDetailsDao dao  = new OrderDetailsDao();
        System.out.println(dao.getAllOrderDetails().toString());
    }
}
