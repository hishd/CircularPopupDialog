# Circular Popup Dialog

Circular popup for android, a popup dialog based on [HassanUsmans](https://github.com/HassanUsman/CircularDialogs "HassanUsman") original circular dialog.

### Screenshot
![](https://github.com/hishd/CircularPopupDialog/raw/master/images/popup.gif)

### Installation & Setup

------------

The easiest way to use CircularPopup is to add the android library to your projects dependencies.

Add the repository to your project build.gradle

```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```

##### Gradle
```
dependencies {
    implementation 'com.github.hishd:CircularPopup:1.0'
}
```

## Usage

#### Show success popup dialog
```
new CircularPopup(MainActivity.this)
                        .createAlert("Warning Dialog", Constraints.WARNING,Constraints.LARGE)
                        .setAnimation(Constraints.SCALE_FROM_BOTTOM_TO_TOP)
                        .setDuration(1000)
                        .setTextSize(Constraints.NORMAL_TEXT_SIZE)
                        .show();
```
#### Show error popup dialog
```
new CircularPopup(MainActivity.this)
                        .createAlert("Failure Dialog", Constraints.ERROR,Constraints.LARGE)
                        .setAnimation(Constraints.SCALE_FROM_BOTTOM_TO_TOP)
                        .setDuration(1000)
                        .setTextSize(Constraints.NORMAL_TEXT_SIZE)
                        .show();
```

#### Usages of the methods
| Method Name  | Operation   |
| ------------ | ------------ |
| setAnimation(Constraints.SCALE_FROM_BOTTOM_TO_TOP)  | Sets the enter and exit animation (refer below)  |
| setDuration(1000)  | Set duration in miliseconds  |
| setTextSize(Constraints.NORMAL_TEXT_SIZE)  | Sets the text size (refer below)  |
| createAlert("Dialog Title", Constraints.ERROR,Constraints.LARGE)  | Create a alert dialog (refer below)  |

#### Dialog parameters

**Dialog Types**

The below types should be passed as the second paremeter of the *createAlert()* method.

- Constraints.SUCCESS = Shows a success dialog.
- Constraints.WARNING = Shows a warning dialog.
- Constraints.ERROR = Shows a error dialog.

**Dialog Sizes**

The below types should be passed as the third paremeter of the *createAlert()* method.

- Constraints.SMALL = Shows a small sized dialog.
- Constraints.MEDIUM = Shows a medium sized dialog.
- Constraints.LARGE = Shows a large sized dialog.

**Dialog Text sizes**

The below types should be passed as the  paremeter of the *setTextSize()* method.

- Constraints.NORMAL_TEXT_SIZE
- Constraints.LARGE_TEXT_SIZE
- Constraints.EXTRA_LARGE_TEXT_SIZE

**Dialog Animations**

The below types should be passed as the  paremeter of the *setAnimation()* method.

- Constraints.SCALE_FROM_BOTTOM_TO_BOTTOM
- Constraints.SCALE_TO_BOTTOM_FROM_BOTTOM
- Constraints.SCALE_TO_TOP_FROM_TOP
- Constraints.SCALE_FROM_TOP_TO_TOP
- Constraints.SCALE_FROM_TOP_TO_BOTTOM
- Constraints.SCALE_TO_TOP_FROM_BOTTOM
- Constraints.SCALE_FROM_BOTTOM_TO_TOP

- Constraints.SLIDE_FROM_BOTTOM_TO_BOTTOM
- Constraints.SLIDE_TO_BOTTOM_FROM_BOTTOM
- Constraints.SLIDE_TO_TOP_FROM_TOP
- Constraints.SLIDE_FROM_TOP_TO_TOP
- Constraints.SLIDE_FROM_TOP_TO_BOTTOM
- Constraints.SLIDE_TO_TOP_FROM_BOTTOM
- Constraints.SLIDE_FROM_BOTTOM_TO_TOP

- Constraints.SCALE_FROM_LEFT_TO_LEFT
- Constraints.SCALE_TO_LEFT_FROM_LEFT
- Constraints.SCALE_TO_RIGHT_FROM_RIGHT
- Constraints.SCALE_FROM_RIGHT_TO_RIGHT
- Constraints.SCALE_FROM_RIGHT_TO_LEFT
- Constraints.SCALE_TO_RIGHT_FROM_LEFT
- Constraints.SCALE_FROM_LEFT_TO_RIGHT

- Constraints.SLIDE_FROM_LEFT_TO_LEFT
- Constraints.SLIDE_TO_LEFT_FROM_LEFT
- Constraints.SLIDE_TO_RIGHT_FROM_RIGHT
- Constraints.SLIDE_FROM_RIGHT_TO_RIGHT
- Constraints.SLIDE_FROM_RIGHT_TO_LEFT
- Constraints.SLIDE_TO_RIGHT_FROM_LEFT
- Constraints.SLIDE_FROM_LEFT_TO_RIGHT

#### Using customized icons

CircularPopup createAlert(String message, Bitmap icon, int alertType, int givenSize)

OR

CircularPopup createAlert(String message, Drawable icon, int alertType, int givenSize)


###### Please Refer the Sample project for more information.

