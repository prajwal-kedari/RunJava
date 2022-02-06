import java.time.LocalDateTime;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        LocalDateTime now = LocalDateTime.now();
        String min   = String.valueOf( now.getMinute()     *2  );
        String month = String.valueOf( now.getMonthValue() *60 );
        String year  = String.valueOf( now.getYear()       *7  );
        String hour  = String.valueOf( now.getHour()       *4  );
        String day   = String.valueOf( now.getDayOfMonth() *9  );
        String  strkey   = min+month+year+hour+day;
        System.out.println("key:- "+ strkey);
    }
}
