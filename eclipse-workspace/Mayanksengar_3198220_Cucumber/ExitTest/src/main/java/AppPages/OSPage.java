package AppPages;

import org.openqa.selenium.By;

public class OSPage {
	public static By OS_Btn =By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[9]");
	public static By SMSMessaging_Btn=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]");
	public static By Enable_Btn=By.id("com.example.android.apis:id/sms_enable_receiver");
	public static By sms_recipient=By.id("com.example.android.apis:id/sms_recipient");
	public static By sms_content=By.id("com.example.android.apis:id/sms_content");
	public static By send_messagebtn=By.id("com.example.android.apis:id/sms_send_message");
}
