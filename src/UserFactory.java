public  class UserFactory {

   public User createUser(String type){
       if(type.equals("admin")){
           return new Admin();
       }
       else{
           return new Customer();
       }


   }

}
