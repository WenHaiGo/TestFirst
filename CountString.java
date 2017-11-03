package DiQiZhang;
//2017年11月1日17:58:56

public class CountString {

    public static void main(String[] args) {
	String str = "aaaabbc中国1512";
	int letterCount = 0;
	int chineseCount = 0;
	int numberCount = 0;
	System.out.println((int)'a'+" "+(int)'z'+" "+(int)'A'+" "+(int)'Z');
	for (int i = 0; i <str.length(); i++) {
	    char temp = str.charAt(i);
	    if((int)temp>=48&&(int)temp<10+48)
	    {
		numberCount++;
	    }
	    
	    else if((int)temp>=65&&(int)temp<=122)
	    {
		letterCount++;
	    }
	    
	    else 
		chineseCount++;
	    
	}
	
	System.out.println(numberCount+" "+letterCount+" "+chineseCount);
    }
}
