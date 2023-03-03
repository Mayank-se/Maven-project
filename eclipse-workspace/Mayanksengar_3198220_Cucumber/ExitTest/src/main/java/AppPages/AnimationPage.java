package AppPages;

import org.openqa.selenium.By;

public class AnimationPage {
	public static By Animation_Btn =By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]");
	public static By Hideshow_btn=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[7]");
	public static By HideRadio_btn=By.id("com.example.android.apis:id/hideGoneCB");
	public static By HideButtons_btn=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]");
	public static By Show_btn=By.id("com.example.android.apis:id/addNewButton");
	public static By CustomRadio_btn=By.id("com.example.android.apis:id/customAnimCB");
	public static By CustomFirst_btn=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]");
	public static By CustomSec_btn=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]");
}
