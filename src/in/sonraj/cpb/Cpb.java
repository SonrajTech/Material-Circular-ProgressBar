package in.sonraj.cpb;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

public class Cpb extends AndroidNonvisibleComponent {

  private final Context context;
  private CircularProgressBar circularProgressBar;
  private int progressColor = Color.CYAN;
  private int textColor =Color.CYAN;
  private int width=30;
  private boolean show=true;
  private boolean useCorner=true;

  public Cpb(ComponentContainer container) {
    super(container.$form());
    context = container.$context();
  }

  @SimpleFunction(description = "Setup the material circular progress bar view.")
  public void SetMaterialView(AndroidViewComponent view) {
    ViewGroup viewGroup= (ViewGroup) view.getView();
    circularProgressBar=new CircularProgressBar(context);
    viewGroup.addView(circularProgressBar);
  }

  @SimpleFunction(description = "Set the progress of the progress bar")
  public void SetProgress(int animationDuration, int progress){
    circularProgressBar.setProgressColor(progressColor);
    circularProgressBar.setTextColor(textColor);
    circularProgressBar.setProgressWidth(width);
    circularProgressBar.showProgressText(show);
    circularProgressBar.useRoundedCorners(useCorner);
    circularProgressBar.setProgress(animationDuration, progress);
  }

  @SimpleProperty(description = "Set progress color of the material circular progress bar.")
  @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_COLOR)
  public void ProgressColor(int color){
    this.progressColor =color;
  }

  @SimpleProperty()
  public int ProgressColor(){
    return progressColor;
  }

  @SimpleProperty(description = "Set text color of the material circular progress bar.")
  @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_COLOR, defaultValue = DEFAULT_VALUE_COLOR_CYAN)
  public void TextColor(int color){
    this.textColor =color;
  }

  @SimpleProperty()
  public int TextColor(){
    return textColor;
  }

  @SimpleProperty(description = "Set progress width of the material circular progress bar.")
  @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_INTEGER, defaultValue = "30")
  public void ProgressWidth(int width){
    this.width=width;
  }

  @SimpleProperty()
  public int ProgressWidth(){
    return width;
  }

  @SimpleProperty(description = "Show progress text of the material circular progress bar.")
  @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN, defaultValue = "True")
  public void ShowProgressText(boolean show){
    this.show=show;
  }

  @SimpleProperty()
  public boolean ShowProgressText(){
    return show;
  }

  @SimpleProperty(description = "Set rounded corners of the material circular progress bar.")
  @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN, defaultValue = "True")
  public void RoundedCorners(boolean useCorner){
    this.useCorner=useCorner;
  }

  @SimpleProperty()
  public boolean RoundedCorners(){
    return useCorner;
  }


}
