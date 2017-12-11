# Android-Extension-functions
List of all the Kotlin Extension Functions that can be used in your Android Application (Updating)

Kotlin Android Extensions are usually used for eliminating findViewById() calls, it can also be used for extending the existing Android APIs to be less verbose and provide extra functionalities, you can add the following extensions in your Extensions.kt file in your application to use them directly in your app.

Feel free to add your custom Extension function in this by sending a pull request/creating an issue, also star it if you find any of these useful. Will keep updating the list, **All Contributions are Welcomed** - Thanks.

## How to use?
Add the following statement to your build script in order to enable Extensions in your app. 

```groovy
androidExtensions {
    experimental = true
}
```

You can either use the functionality you require by pasting the code inside your Extensions.kt file, or pull the Extensions file and replace the `your-package-name` to the package you import the file to, and you're good to go.

#### > You can use the [KrazyKotlin](https://github.com/vanshg/KrazyKotlin "KrazyKotlin") library for Generic Utilities. ####


## List of Extensions
- Toasts
- ViewGroup.inflate
- ImageView.load // If using Picasso Image Loading Library
