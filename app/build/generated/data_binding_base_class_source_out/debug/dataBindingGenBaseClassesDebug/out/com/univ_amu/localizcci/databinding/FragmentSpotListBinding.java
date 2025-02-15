// Generated by data binding compiler. Do not edit!
package com.univ_amu.localizcci.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.univ_amu.localizcci.R;
import com.univ_amu.localizcci.viewmodels.SpotListViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSpotListBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView spotList;

  @Bindable
  protected SpotListViewModel mModel;

  protected FragmentSpotListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView spotList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.spotList = spotList;
  }

  public abstract void setModel(@Nullable SpotListViewModel model);

  @Nullable
  public SpotListViewModel getModel() {
    return mModel;
  }

  @NonNull
  public static FragmentSpotListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_spot_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSpotListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSpotListBinding>inflateInternal(inflater, R.layout.fragment_spot_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSpotListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_spot_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSpotListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSpotListBinding>inflateInternal(inflater, R.layout.fragment_spot_list, null, false, component);
  }

  public static FragmentSpotListBinding bind(@NonNull View view) {
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
  public static FragmentSpotListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSpotListBinding)bind(component, view, R.layout.fragment_spot_list);
  }
}
