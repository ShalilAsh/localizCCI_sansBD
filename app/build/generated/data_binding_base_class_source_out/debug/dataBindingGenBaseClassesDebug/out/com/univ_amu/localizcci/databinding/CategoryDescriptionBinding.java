// Generated by data binding compiler. Do not edit!
package com.univ_amu.localizcci.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.univ_amu.localizcci.R;
import com.univ_amu.localizcci.data.Category;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CategoryDescriptionBinding extends ViewDataBinding {
  @NonNull
  public final TextView categoryDescription;

  @NonNull
  public final TextView categoryName;

  @NonNull
  public final ImageView imgcat;

  @Bindable
  protected Category mCategory;

  protected CategoryDescriptionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView categoryDescription, TextView categoryName, ImageView imgcat) {
    super(_bindingComponent, _root, _localFieldCount);
    this.categoryDescription = categoryDescription;
    this.categoryName = categoryName;
    this.imgcat = imgcat;
  }

  public abstract void setCategory(@Nullable Category category);

  @Nullable
  public Category getCategory() {
    return mCategory;
  }

  @NonNull
  public static CategoryDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.category_description, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CategoryDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CategoryDescriptionBinding>inflateInternal(inflater, R.layout.category_description, root, attachToRoot, component);
  }

  @NonNull
  public static CategoryDescriptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.category_description, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CategoryDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CategoryDescriptionBinding>inflateInternal(inflater, R.layout.category_description, null, false, component);
  }

  public static CategoryDescriptionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static CategoryDescriptionBinding bind(@NonNull View view, @Nullable Object component) {
    return (CategoryDescriptionBinding)bind(component, view, R.layout.category_description);
  }
}