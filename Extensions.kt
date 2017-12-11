package com.your-package-name.utils

import android.support.v4.app.FragmentActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

/**
 * Toast function for Activity
 */
fun FragmentActivity.toast(text: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}

/**
 * Inflate the layout
 * @param layoutRes layout resource id
 */
fun ViewGroup.inflate(layoutRes: Int): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, false)
}

/**
* If using Picasso you can tell ImageView to load the URL using the below function
*/
fun ImageView.loadUrl(url: String) {
    Picasso.with(context).load(url).into(this)
}

imageView.load(url)
