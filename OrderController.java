
@RestController
public class OrderController{

@Autowired
OrderservicInterface orederservice;
//Get all customer details
@RequestMapping("/allCustomers")
public List<Customer> getCustomers(){

List<Customer> clist=new ArrayList<Customer>();

try{
    clst=orederservice.getcustomers();
}cartch(Exception e){
 e.printStacktrace();
}
return clist;
}

//get customer details by id
@RequestMapping("/ustomerById/{cid}")
public List<Customer> getCustomerById(@Requestparam(int cid)int cid){

List<Customer> cidbycust=new ArrayList<Customer>();

try{
    cidbycust=orederservice.getcustomerById(cid);
}cartch(Exception e){
 e.printStacktrace();
}
return cidbycust;
}

//get update customer details by id
@RequestMapping("/ustomerById/{cid}")
public List<Customer> updateCustomerById(@Requestparam(int cid)int cid){

List<Customer> cidbycust=new ArrayList<Customer>();

try{
    cidbycust=orederservice.getcustomerById(cid);
}cartch(Exception e){
 e.printStacktrace();
}
return cidbycust;
}


//get all order details
@RequestMapping("/allorders")
public List<Order> getCustomers(){

List<Order> olist=new ArrayList<Order>();
 try{
  olst=orederservice.getAllOrders();
}catch(Exception e){
 e.printStacktrace();
}
return olst;
}
@RequestMapping("/orderById/{oid}")
public List<Order> getOrderById(@RequestParam("oid")int oid){
List<Order> olistById=new ArrayList<Order>();
 try{
 olistById=orederservice.getOrderById(oid);
 }catch(Exception e){
 e.printStacktrace();
 }
return olistById;
}
}


//update order by Id
@RequestMapping("/orderupdeteById/{oid}")
public List<Order> updateOrderById(@RequestParam("oid")int oid){
List<Order> olistById=new ArrayList<Order>();
boolean updatestatus=false;
try{
 updatestatus=orederservice.updateOrderById(oid);
 if(updatestatus !=false){
 olistById=orederservice.getOrderById(oid);
 }
 
 }catch(Exception e){
 e.printStacktrace();
 }
return olistById;
}
}







}

