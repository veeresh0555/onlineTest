
//RestClient

public class OrderservicInterface {

Order order=new Order();
order.setoid(123);
order.setoitem("bricks1");

Customer cust=new Customer();
cust.setCid(126);
cust.setCName("Raky");


public List<Customer> getCustomers(){

List<Customer> clist=new ArrayList<Customer>();

try{
   clist.add(Customer);
}cartch(Exception e){
 e.printStacktrace();
}
return clist;
}

public List<Customer> getcustomerById(int cid){

List<Customer> cidbycust=new ArrayList<Customer>();
try{
    cidbycust.add(Customer);
    
    }cartch(Exception e){
 e.printStacktrace();
}
return cidbycust;
}

public List<Customer> getcustomerById(int cid){

List<Customer> cidbycust=new ArrayList<Customer>();

try{
    
    cidbycust.add(customer);
}cartch(Exception e){
 e.printStacktrace();
}
return cidbycust;
}



public List<Order> getAllOrders(){

List<Order> olist=new ArrayList<Order>();
 try{
  olst.add(Order);
}catch(Exception e){
 e.printStacktrace();
}
return olst;
}

public List<Order> getOrderById(int oid){
List<Order> olistById=new ArrayList<Order>();
 try{
 olistById.add(Order);
 }catch(Exception e){
 e.printStacktrace();
 }
return olistById;
}
}


//update order by Id
@RequestMapping("/orderupdeteById/{oid}")
public List<Order> updateOrderById(int oid){
List<Order> olistById=new ArrayList<Order>();
boolean updatestatus=false;
Order ord=new Order();
try{
ord.set(oid);
 updatestatus=true;
 if(updatestatus !=false){
 olistById.add(Order);
 }
 
 }catch(Exception e){
 e.printStacktrace();
 }
return olistById;
}
}







}



}
