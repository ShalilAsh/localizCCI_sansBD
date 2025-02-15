// Generated by data binding compiler. Do not edit!
package com.univ_amu.localizcci.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.univ_amu.localizcci.R;
import com.univ_amu.localizcci.viewmodels.SpotViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSpotBinding extends ViewDataBinding {
  @NonNull
  public final CardView spotFragment;

  @Bindable
  protected SpotViewModel mModel;

  protected FragmentSpotBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView spotFragment) {
    super(_bindingComponent, _root, _localFieldCount);
    this.spotFragment = spotFragment;
  }

  public abstract void setModel(@Nullable SpotViewModel model);

  @Nullable
  public SpotViewModel getModel() {
    return mModel;
  }

  @NonNull
  public static FragmentSpotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_spot, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSpotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSpotBinding>inflateInternal(inflater, R.layout.fragment_spot, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSpotBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_spot, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSpotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSpotBinding>inflateInternal(inflater, R.layout.fragment_spot, null, false, component);
  }

  public static FragmentSpotBinding bind(@NonNull View view) {
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
  public static FragmentSpotBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSpotBinding)bind(component, view, R.layout.fragment_spot);
  }
}
