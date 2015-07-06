# TrayNotification

<p align="center">

Tray Notification is a object coded in JavaFX that is used to construct tray notifications on desktop computers. The TrayNotification comes with 5 preloaded notification types but also allows users to create their own custom tray.
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
This therefore produces.
</p>

<p align="center">
<img src = "http://i.imgur.com/IFmooQe.jpg"/>
</p>
<br>
<br>

<p align="center">
The default animation type is a sliding animation.
Which when shownAndWait() is called is animated which looks like
</p>


<br>
<br>
<img src = "http://i.imgur.com/2xr6k7E.gif"/>
<br>
<br>
<br>
<br>
<br>
<br>

<p align="center">
You can also set a different notification type and set a different animation type.
For example, we can use a Notice nofitication type and a fading animation.
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
<img src = "http://i.imgur.com/sFHp2vJ.gif"/>
<br>
<br>

<p align="center">
You can set a custom image, custom rectangle fill, and we can also use a popup animation.
You can also use a showAndDismiss, which will show both the show and dismiss animation. It also
allows you to set a parameter which contros how long the the computer should wait before showing the dismiss animation.
</p>

```java
        Image whatsApp = new Image("https://cdn4.iconfinder.com/data/icons/iconsimple-logotypes/512/whatsapp-128.png");
        
        tray.setTitle("New WhatsApp Message");
        tray.setMessage("Github - I like your new notification release. Nice one.");
        tray.setRectangleFill(Paint.valueOf("#2A9A84"));
        tray.setAnimationType(AnimationType.POPUP);
        tray.setImage(whatsApp);
        tray.showAndDismiss(Duration.seconds(2));
```

<br>
<br>
<p align="center">
<img src = "http://i.imgur.com/VjPOzza.gif"/>
</p>
<br>
<br>

<p align="center">
Finally, a short hand to changing the design of a tray animation is.
tray.setTray();
</p>

```java

        tray.setTray("Title", "Message", NotificationType.ERROR);
        tray.showAndWait();
        
        //OR
        tray.setTray("Title", "Message", whatsAppImg, Paint.valueOf("#2A9A84") , AnimationType.POPUP);
        tray.showAndDismiss(Duration.seconds(10));

```
