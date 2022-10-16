import java.time.LocalDateTime;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        LocalDateTime now = LocalDateTime.now();
        String min1   = String.valueOf( now.getMinute()     *2  );
        String month1 = String.valueOf( now.getMonthValue() *60 );
        String year1  = String.valueOf( now.getYear()       *7  );
        String hour1  = String.valueOf( now.getHour()       *4  );
        String day1   = String.valueOf( now.getDayOfMonth() *9  );
        String  strkey1   = min1+month1+year1+hour1+day1;
        System.out.println("key will this= > "+ strkey);
    }
}
