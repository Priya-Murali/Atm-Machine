package atmproject;

class Invalid_transaction extends Exception
{
     String errorMessage;
     public Invalid_transaction(String message)
     {
        errorMessage = message;
     }  
     @Override
      public String getMessage()
      {
          return errorMessage;
      }
}
