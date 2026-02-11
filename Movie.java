public class Movie
{
  private String title;
  private double duration;
  
  public Movie(String title, double duration)
  {
    this.title = title;
    this.duration = duration;
  }
  
  public String getTitle()
  {
    return title;
  }
  
  public double getDuration()
  {
    return duration;
  }
  
  public void setTitle(String t)
  {
    title = t;
  }
  
  public void setDuration(double d)
  {
    duration = d;
  }
  
  public String toString()
  {
    String info = "\"" + title + "\", duration " + duration;
    return info;
  }
}
