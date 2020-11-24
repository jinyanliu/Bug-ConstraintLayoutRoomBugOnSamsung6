# ConstraintLayoutRoomBugOnSamsung6

How to reproduce:
1. Get a Samsung S5 G900F 6.0.1.
2. (Except the first installation, everytime after, make sure to uninstall first, then reinstall.) Install the app.
3. textView2 should be GONE intead of INVISIBLE.
4. Observation: Something happening with Room and ConstraintLayout. 

Solutions:
- Can be fixed using a LinearLayout instead of ConstraintLayout. 
- Can be fixed if delay 5 seconds after reading from database. 
- Can be fixed wrapping a FrameLayout/LinearLayout outside of textView2 (the view you want to set to GONE).
