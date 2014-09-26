# Gradle Lab for Android

This lab is meant to get you up and running with building your Android apps with Gradle.

## Preparations

First of all, you need to check out this repo.

```
git clone https://github.com/jayway/lab_android_gradle
```

You also need to have gradle installed. If you're on a mac and have brew install, `brew install gradle` will do the trick. Linux users can most likely `apt-get` it. For other platforms, check out http://www.gradle.org/.

## Reference

You will need to google quite a lot to get everything working. But you
can find some good information about the android gradle plugin here:
http://tools.android.com/tech-docs/new-build-system/user-guide.

(Note that the latest android gradle version, at the time of writing,
 is 0.13.1, regardless of what the link above states.)

## Lab Instructions

### Step 1: Creating a gradle project from existing source

1. Create a new folder outside of this git repository. This is where you
   will be doing most of the lab.

2. In your cloned repository, check out the tag `step_1`:
   ```
   git checkout step_1
   ````

3. Copy all the files from this repository to the lab folder you created
   in step 1. The resulting folder structure should look something like
   this:

   ```
   <lab-folder>
     `---main_app
           |--AndroidManifest.xml
           |--src
           |--res
           |--libs
              |--android-support-v4.jar
              `--super_math.jar
   ```
   Note that there are two jars in the lib folder.

4. In the main_app folder, make the Android app build with gradle. There
   are several ways to do this. Some will change the existing folder
   structure as well.

   The existing jars is needed by the app, but the support package jar
   can be downloaded from maven central instead of lying in the libs
   folder.

   In the end, check out the existing tasks with `gradle tasks` and build
   and run the app.


Make sure that you can build and deploy the app.

#### Questions:

1. What are all the tasks for? Are there any tasks that you don't
   understand?
2. Did you change the folder structure to the standard maven/gradle
   structure? What are the pros and cons of the different folder
   structures?

### Step 2: Adding a library project

1. Go back to your git and check out `step_2``
   ```
   git checkout step_2
   ```

2. Copy all the files to your lab folder again. Beside the `main_app`
   folder, there is a library project.

3. Again, use your gradle magic to make first the library project to
   build and then make it available to the main_app project.

4. Add a build.gradle file in the root of your lab folder so you can
   build both projects at once.

5. Create a gradle wrapper in the root of your lab folder.

#### Questions
1. Why do you want the gradle wrapper? Should it be checked in together
   with the code?

2. If you built the library project in a completely separate gradle
   project, how would the main_app refer to it?


### Step 3: Adding flavours

1. We want two flavours of our app: `normal` and `super`. The only
   difference will be the message that is shown on the first screen.
   Makes sure that the `super` version shows `Welcome to the
   SUPER-DUPER gradle lab`.

#### Questions

1. Can you think of a more real-life use case where flavours would be
   useful?

2. Are there any other ways of solving the problem with building
   multiple variants of your application?


### Step 4: Add your own task

If you come this far, you're probably ready for something more
substantial to chew on.

1. Write your own task that will be included in the build steps.
   Examples of tasks you could write are:

   * A task to copy the resulting apk to another folder.
   * Rename the apk file to add the build time and date.



