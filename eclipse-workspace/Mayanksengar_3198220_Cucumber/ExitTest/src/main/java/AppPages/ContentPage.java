package AppPages;

import org.openqa.selenium.By;

public class ContentPage {
	public static By Content_Btn =By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]");
	public static By Undo_btn=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[8]");
	public static By Textview_txt=By.id("com.example.android.apis:id/default_text");
	public static By Appends_btn=By.id("com.example.android.apis:id/append_text");
	public static By Insertbtn=By.id("com.example.android.apis:id/insert_text");
	public static By Sometext_btn=By.id("com.example.android.apis:id/set_text");
	public static By Textview_Text=By.id("com.example.android.apis:id/undo_disabled_text");
	public static By Textview_length=By.id("com.example.android.apis:id/length_limit_text");
	public static By Textview_Cardno=By.id("com.example.android.apis:id/credit_card_text");
}
