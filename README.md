ItCompilesSoItWorks
===================
Add whatever whenever. Just make sure it compiles before you push to the master branch. Have fun! :smirk:


###Building in Android Studio
This is very easy, just follow these simple steps.

1. Download and extract Gradle (http://services.gradle.org/distributions/gradle-1.7-bin.zip) somewhere on your computer.
2. Download and install the latest version of Android Studio (http://developer.android.com/sdk/installing/studio.html)
3. Open Android Studio and click 'Check out from Version Control' -> 'Git'.
4. In the next dialog, put ```https://github.com/kl/ItCompilesSoItWorks.git``` in the 'Git Repository URL' field and click 'Clone'.
5. When it asks if you want to open the project click 'Yes'.
6. In the next dialog uncheck 'Use auto-import' and enter the folder where you extracted Gradle in the 'Gradle home' field. Click next and the project will now open and compile.

###Pulling changes to your local machine from within Android Studio

If you have cloned the repository and set up the Android Studio project as described you can easily download changes made to this repository to your local machine from within Android Studio, without using Git from the command line. To do so, click 'VCS' -> 'Update Project' in the main menu. In the next dialog select 'Merge' and 'Using Stash' and then click OK.

###Pushing to GitHub from within Android Studio

Make some changes and the press Ctrl + K. Add a commit message and click 'Commit and push'.
