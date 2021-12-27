# Live for Android



The Live for Android Sample App is an open-source demo that will help you get live video broadcasting integrated directly into your Android applications using the Agora Video SDK.

With this sample app, you can:

- Join / leave channel
- Set role as broadcaster or audience
- Mute / unmute audio
- Switch camera
- Setup resolution, frame rate and bit rate
- real time chating with pubnub.com




### Obtain an App ID

To build and run the sample application, get an App ID:
1. Create a developer account at [agora.io](https://dashboard.agora.io/signin/). Once you finish the signup process, you will be redirected to the Dashboard.
2. Navigate in the Dashboard tree on the left to **Projects** > **Project List**.
3. Save the **App ID** from the Dashboard for later use.
4. Generate a temp **Access Token** (valid for 24 hours) from dashboard page with given channel name, save for later use.

5. Update "app/src/main/res/values/strings_config.xml" with your App ID 
  ```xml
  <string name="private_app_id"><#YOUR APP ID#></string>```

### Integrate the Agora Video SDK

The SDK must be integrated into the sample project before it can opened and built. There are two methods for integrating the Agora Video SDK into the sample project. The first method uses JCenter to automatically integrate the SDK files. The second method requires you to manually copy the SDK files to the project.

#### Method 1 - Integrate the SDK Automatically Using JCenter (Recommended)

1. Clone this repository.
2. Open **app/build.gradle** and add the following line to the `dependencies` list:

  ```
  ...
  dependencies {
      ...
      implementation 'io.agora.rtc:full-sdk:3.+'
  }
  ```

#### Method 2 - Manually copy the SDK files

1. Download the Agora Video SDK from [Agora.io SDK](https://www.agora.io/en/download/).
2. Unzip the downloaded SDK package.
3. Copy the following files from from the **libs** folder of the downloaded SDK package:

Copy from SDK|Copy to Project Folder
---|---
.jar file|**/apps/libs** folder
**arm64-v8a** folder|**/app/src/main/jniLibs** folder
**x86** folder|**/app/src/main/jniLibs** folder
**armeabi-v7a** folder|**/app/src/main/jniLibs** folder

​    

### Run the Application

Open project with Android Studio, connect your Android device, build and run.
      
Or use `Gradle` to build and run.
