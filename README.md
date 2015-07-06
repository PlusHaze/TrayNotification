# TrayNotification

<p align="center">

Tray Notification is a object coded in JavaFX that is used to construct tray notifications on desktop computers. The TrayNotification comes with 5 preloaded notification types but also allows users to create their own custom tray.
<br>
To use, create an instance of TrayNotification class and define its title, message and notificationType
<br>
<br>
<p>

```java

        String title = "Congratulations Sir";
        String message = "You've successfully created your very first Tray Notification";
        NotificationType type = NotificationType.SUCCESS;
        
        TrayNotification tray = new TrayNotification();
        tray.setTitle(title);
        tray.setMessage(message);
        tray.setNotificationType(type);
        tray.showAndWait();
```

An alternative is to initialize the Tray Notification via the Constructors.

```java
        TrayNotification tray = new TrayNotification(title, message, type);
        tray.showAndWait();
```

This therefore produces.




Here is an image of the API calls that can be made using the TrayNotification class.
<br>
<br>
<img src = ""/>
<br>
<br>

This is the recent scores where you can view all of the past games you've played.

<br>
<br>
<img src = ""/>
<br>
<br>


Finally, here's the main game scene.

<br>
<br>
<img src = ""/>
<br>
<br>

</p>
