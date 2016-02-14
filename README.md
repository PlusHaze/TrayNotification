[![](https://jitpack.io/v/PlusHaze/TrayNotification.svg)](https://jitpack.io/#PlusHaze/TrayNotification)

# Tray Notification

_Tray Notification_ is a library for JavaFX that adds easy-to-use tray notifications for desktop computers.  

There are 5 included notifications and 3 included animations, but you're able to also add your own.

___

### Creating a new tray notification

<p align="center">
To use, create an instance of <em>TrayNotification</em> and define its title, message and notification.
<br>
</p>

```java
        String title = "Congratulations sir";
        String message = "You've successfully created your first Tray Notification";
        Notification notification = Notifications.SUCCESS;
        
        TrayNotification tray = new TrayNotification();
        tray.setTitle(title);
        tray.setMessage(message);
        tray.setNotification(notification);
        tray.showAndWait();
```

<p align="center">
Alternatively you can initialize the tray notification with its non-default constructors.
</p>

```java
        TrayNotification tray = new TrayNotification(title, message, notification);
        tray.showAndWait();
```

<p align="center">
<img src = "http://i.imgur.com/IFmooQe.jpg"/>
</p>
<br>
<br>

<p align="center">
The default animation is a sliding animation.

When <em>shownAndWait()</em> is called, the tray notification will show and wait until it is either dismissed
with the close button or programmatically through your code. 
</p>

<br>
<br>
<p align="center">
<img src = "http://i.imgur.com/2xr6k7E.gif"/>
</p>
<br>
<br>

___

### Using different animations and notifications

<p align="center">
You can also individually customize notifications and animations.
<br>
Using a notice notification with a fading animation, for example:
</p>

```java
        String title = "Download quota reached";
        String message = "Your download quota has been reached. Panic.";
        Notification notification = Notifications.NOTICE;
        
        tray.setTitle(title);
        tray.setMessage(message);
        tray.setNotification(notification);
        tray.setAnimation(Animations.FADE);
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
You're also able to set a custom image or rectangle fill. You can use <em>showAndDismiss</em>, which will show both the
show and dismiss animation. You're also able to control the delay before dismissal following the show animation.
This is useful for when you want a notification to appear for a certain amount of time before closing.
</p>

```java
        Image whatsAppImg = new Image("https://cdn4.iconfinder.com/data/icons/iconsimple-logotypes/512/whatsapp-128.png");
        
        tray.setTitle("New WhatsApp Message");
        tray.setMessage("Github - I like your new notification release. Nice one.");
        tray.setRectangleFill(Paint.valueOf("#2A9A84"));
        tray.setAnimation(Animations.POPUP);
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
A shorthand to changing the design of a tray animation is to use the <em>setTray</em>'s overloaded methods.
</p>

```java

        tray.setTray("Title", "Message", Notifications.ERROR);
        tray.showAndWait();
        
        //OR
        tray.setTray("Title", "Message", whatsAppImg, Paint.valueOf("#2A9A84") , Animations.POPUP);
        tray.showAndDismiss(Duration.seconds(10));

```

___


### YouTube video demonstration

<p align="center">

The video below showcases the <em>TrayTester.jar</em> app 
<a href="TrayTester.jar">which you can get here</a>.
<br>
<br>
Click the image below to watch the YouTube video.

<br>
<br>

<a href="https://www.youtube.com/watch?v=SeaF3lTmbQE" target="_blank">
  <img src="http://i.imgur.com/2k0Sw7F.jpg" width="380" height="566" border="10" />
</a>
</p>
