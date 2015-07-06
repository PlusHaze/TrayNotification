# TrayNotification

___

### Creating a new tray notification

<p align="center">

Tray Notification is a class coded in JavaFX that is used to construct tray notifications which can be shown on desktop computers. The TrayNotification comes with 5 preloaded notification types and 3 animation types, but also allows users to create their own custom tray types.

<br>
To use, create an instance of TrayNotification class and define its title, message and notificationType
<br>
<br>
</p>

```java
        String title = "Congratulations sir";
        String message = "You've successfully created your first Tray Notification";
        NotificationType type = NotificationType.SUCCESS;
        
        TrayNotification tray = new TrayNotification();
        tray.setTitle(title);
        tray.setMessage(message);
        tray.setNotificationType(type);
        tray.showAndWait();
```

<p align="center">
An alternative is to initialize the Tray Notification via the Constructors.
</p>

```java
        TrayNotification tray = new TrayNotification(title, message, type);
        tray.showAndWait();
```

<p align="center">
This therefore produces the tray notification, as shown below.
</p>

<p align="center">
<img src = "http://i.imgur.com/IFmooQe.jpg"/>
</p>
<br>
<br>

<p align="center">
The default animation type is a sliding animation.

When shownAndWait() is called, the tray notification will show and wait till it's dismissed either progrmatically or using the close button. 

When showAndWait() is called it produces an animated entrance which looks the gif below
</p>

<br>
<br>
<p align="center">
<img src = "http://i.imgur.com/2xr6k7E.gif"/>
</p>
<br>
<br>

___

### Using different animation and notification types

<p align="center">
You can also set a different notification and animation type.
For example, you can use a Notice nofitication type with a fading animation.
</p>

```java
        String title = "Download quota reached";
        String message = "Your download quota has been reached. Panic.";
        NotificationType type = NotificationType.NOTICE;
        
        tray.setTitle(title);
        tray.setMessage(message);
        tray.setNotificationType(type);
        tray.setAnimationType(AnimationType.FADE);
        tray.showAndWait();
```

<br>
<br>
<p align="center">
<img src = "http://i.imgur.com/sFHp2vJ.gif"/>
</p>
<br>
<br>

___

### Creating a custom tray notification

<br>

<p align="center">
You can set a custom image, custom rectangle fill, and we can also use a popup animation.
You can also use a showAndDismiss, which will show both the show and dismiss animation. It also
allows you to set a parameter which controls how long the tray should wait after the show animation to run the dismiss animation. This is great when you want notifications to show for x amount of time before closing.
</p>

```java
        Image whatsAppImg = new Image("https://cdn4.iconfinder.com/data/icons/iconsimple-logotypes/512/whatsapp-128.png");
        
        tray.setTitle("New WhatsApp Message");
        tray.setMessage("Github - I like your new notification release. Nice one.");
        tray.setRectangleFill(Paint.valueOf("#2A9A84"));
        tray.setAnimationType(AnimationType.POPUP);
        tray.setImage(whatsAppImg);
        tray.showAndDismiss(Duration.seconds(2));
```
<br>
<p align="center">
<img src = "http://i.imgur.com/VjPOzza.gif"/>
</p>
<br>


___

### Setting a new tray overload methods

<p align="center">
A short hand to changing the design of a tray animation is to use the setTray() overload methods as shown below.
</p>

```java

        tray.setTray("Title", "Message", NotificationType.ERROR);
        tray.showAndWait();
        
        //OR
        tray.setTray("Title", "Message", whatsAppImg, Paint.valueOf("#2A9A84") , AnimationType.POPUP);
        tray.showAndDismiss(Duration.seconds(10));

```

___


### YouTube video demonstration

<p align="center">

The video below is the TrayTester.jar file which can be found in diretory https://github.com/PlusHaze/TrayNotification/tree/master/out/TrayTester.jar

Click the image to go to the YouTube video.

<br>
<br>

<a href="https://www.youtube.com/watch?v=SeaF3lTmbQE"
target="_blank"><img src="http://i.imgur.com/2k0Sw7F.jpg" 
alt="IMAGE ALT TEXT HERE" width="380" height="566" border="10" /></a>
</p>
