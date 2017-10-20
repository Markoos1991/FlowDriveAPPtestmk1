ReadME

----------------------*Needed for this --------------------------------------------------------------------------------------*
- Recomend installing these before progressing. Also try to place the JARs in an Easy find location

-Appium --(*PUT LINK HERE*)
-Appium Java (http://appium.io/downloads.html)
-Eclipse -- (https://www.eclipse.org/downloads/)
-Android Studio -- (https://developer.android.com/studio/index.html)
-Selenium JAR's -- (http://www.seleniumhq.org/download/)
-Java -- (https://java.com/en/download/)

----------------*Setup Steps----------------------------------------------------------------------------------------------*

-------------------set up Appium--------------------------------------
Server Address 127.0.0.1 Port 4732
Android settings - (The location of The FlowDrive.apk)

Run the server.
-------------------------------Set Up Eclips--------------------------------------

---------------------Set up Android Studio-------------------------------------------------------------
Steps For a Emulated Mobile Device - (In tis example We will set up the default phone)
1) - Open Android Studio, File, New, New Project, Name Project, Next
2)this section asks you for pone details (Presumably for the emulator) Select most recent, Next
3)This is asking wht the app action is - select Basic (for this test), Next
4)Name the action and the layout, Finish.

Should now have created a Project. 
Now to Create and open a Phone emulator.
(You can connect a pone Via USB but this needs the Phone in "USB DeBug" enabled Fora galaxy Ill put instructions at bottom).

1)Open AVD Manager (Looks like the android head infront of a purple rectangle (A Phone) found top left...ish.
2)A window Should open and at bottom left click - "Create Virtual Device"
3)Now have a list of phones and tablets - (the nexus X5 will be fine) - click Next
4)Have a list of System images - (I used Marshmellow) - Next
5)Can now Name Orientate and create - Finish
6)Device will install and appear in the "Youre Virtual Devices" List
7)Click the Start Button - the phone should..should load.

--------------------INSTALL _ FLOWDRIVE on to the emulator -----------------------------
With the emulator open 
Bit Lazey I now but this link explains it perfectley - http://instinctcoder.com/manually-install-apk-files-in-android-studio-emulator/
once the emulator or attached phone is Connected and running (unlockeD)
Run the following in a Admin Comand Window

Type cd “C:\Program Files (x86)\Android\android-studio\sdk\platform-tools” - (If this is where you would find it)
Type adb install "FlowDrive.apk"

1)Copy the FlowDrive.APK file too - Program Files (x86)\Android\android-studio\sdk\platform-tools
2)In Android studio - Start youre Phone Emulator
3)Open Comand Prompt - (Windows Key+R then type CMD)
4)Comands - 
Type - cd “C:\Program Files (x86)\Android\android-studio\sdk\platform-tools”  (The file Path where you placed Flow drive app)
Type - adb install "FlowDrive.apk" Should read "Sucsess" if completed correctly

To Reinstall it adb install -r "FlowDrive.apk" - should install if there were errors before.

------------------Folders/Files relevent to the testing -------------------------------------------------------

- Flow_Drive_App -- Holds all the documentation (*expand on This*)
