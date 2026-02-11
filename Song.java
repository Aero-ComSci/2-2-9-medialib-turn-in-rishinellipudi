public class Song
{
  private String title;
  
  public Song(String title)
  {
    this.title = title;
  }
  
  public String getTitle()
  {
    return title;
  }
  
  public void setTitle(String t)
  {
    title = t;
  }
  
  public String toString()
  {
    String info = "\"" + title + "\"";
    return info;
  }
}
