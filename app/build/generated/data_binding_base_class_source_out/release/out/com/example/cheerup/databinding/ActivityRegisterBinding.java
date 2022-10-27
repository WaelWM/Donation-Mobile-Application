// Generated by view binder compiler. Do not edit!
package com.example.cheerup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cheerup.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText address;

  @NonNull
  public final EditText confirmPassword;

  @NonNull
  public final EditText firstName;

  @NonNull
  public final EditText lastName;

  @NonNull
  public final TextView loginText;

  @NonNull
  public final EditText phone;

  @NonNull
  public final Button registerBtn;

  @NonNull
  public final EditText registerEmail;

  @NonNull
  public final EditText registerPassword;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView, @NonNull EditText address,
      @NonNull EditText confirmPassword, @NonNull EditText firstName, @NonNull EditText lastName,
      @NonNull TextView loginText, @NonNull EditText phone, @NonNull Button registerBtn,
      @NonNull EditText registerEmail, @NonNull EditText registerPassword,
      @NonNull TextView textView, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.address = address;
    this.confirmPassword = confirmPassword;
    this.firstName = firstName;
    this.lastName = lastName;
    this.loginText = loginText;
    this.phone = phone;
    this.registerBtn = registerBtn;
    this.registerEmail = registerEmail;
    this.registerPassword = registerPassword;
    this.textView = textView;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address;
      EditText address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.confirmPassword;
      EditText confirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (confirmPassword == null) {
        break missingId;
      }

      id = R.id.firstName;
      EditText firstName = ViewBindings.findChildViewById(rootView, id);
      if (firstName == null) {
        break missingId;
      }

      id = R.id.lastName;
      EditText lastName = ViewBindings.findChildViewById(rootView, id);
      if (lastName == null) {
        break missingId;
      }

      id = R.id.loginText;
      TextView loginText = ViewBindings.findChildViewById(rootView, id);
      if (loginText == null) {
        break missingId;
      }

      id = R.id.phone;
      EditText phone = ViewBindings.findChildViewById(rootView, id);
      if (phone == null) {
        break missingId;
      }

      id = R.id.registerBtn;
      Button registerBtn = ViewBindings.findChildViewById(rootView, id);
      if (registerBtn == null) {
        break missingId;
      }

      id = R.id.registerEmail;
      EditText registerEmail = ViewBindings.findChildViewById(rootView, id);
      if (registerEmail == null) {
        break missingId;
      }

      id = R.id.registerPassword;
      EditText registerPassword = ViewBindings.findChildViewById(rootView, id);
      if (registerPassword == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, address, confirmPassword,
          firstName, lastName, loginText, phone, registerBtn, registerEmail, registerPassword,
          textView, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
