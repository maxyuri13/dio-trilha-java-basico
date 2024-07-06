public class iPhone implements MusicPlayer, Phone, WebBrowser {
    
  // MusicPlayer methods
  @Override
  public void play() {
      System.out.println("Playing music...");
  }

  @Override
  public void pause() {
      System.out.println("Music paused.");
  }

  @Override
  public void selectMusic(String music) {
      System.out.println("Selecting music: " + music);
  }

  // Phone methods
  @Override
  public void call(String number) {
      System.out.println("Calling " + number + "...");
  }

  @Override
  public void answer() {
      System.out.println("Answering the call.");
  }

  @Override
  public void startVoicemail() {
      System.out.println("Starting voicemail.");
  }

  // WebBrowser methods
  @Override
  public void displayPage(String url) {
      System.out.println("Displaying page: " + url);
  }

  @Override
  public void addNewTab() {
      System.out.println("Adding new tab.");
  }

  @Override
  public void refreshPage() {
      System.out.println("Refreshing page.");
  }

  public static void main(String[] args) {
      iPhone myiPhone = new iPhone();
      
      // Testing Music Player
      myiPhone.selectMusic("My Favorite Song");
      myiPhone.play();
      myiPhone.pause();
      
      // Testing Phone functionality
      myiPhone.call("9999-9999");
      myiPhone.answer();
      myiPhone.startVoicemail();
      
      // Testing Web Browser
      myiPhone.displayPage("www.dio.com");
      myiPhone.addNewTab();
      myiPhone.refreshPage();
  }
}

