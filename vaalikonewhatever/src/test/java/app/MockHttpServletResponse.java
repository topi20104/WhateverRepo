package app;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Locale;

// TODO: Auto-generated Javadoc
/**
 * This mock class is created to enable basic unit testing of the
 * {@link Update} class. Only methods used in the unit test
 * have a non-trivial implementation.
 * 
 * Feel free to change this class or replace it using other ways for testing
 * {@link HttpServlet}s, e.g. Spring MVC Test or Mockito to suit your needs.
 */
class MockHttpServletResponse implements HttpServletResponse {

  /** The content type. */
  private String contentType;
  
  /** The encoding. */
  private String encoding;
  
  /** The writer content. */
  private StringWriter writerContent = new StringWriter();
  
  /** The writer. */
  private PrintWriter writer = new PrintWriter(writerContent);

  /**
   * Sets the content type.
   *
   * @param contentType the new content type
   */
  @Override
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   * Gets the content type.
   *
   * @return the content type
   */
  @Override
  public String getContentType() {
    return contentType;
  }

  /**
   * Gets the writer.
   *
   * @return the writer
   * @throws IOException Signals that an I/O exception has occurred.
   */
  @Override
  public PrintWriter getWriter() throws IOException {
    return writer;
  }

  /**
   * Gets the writer content.
   *
   * @return the writer content
   */
  public StringWriter getWriterContent() {
    return writerContent;
  }

  // anything below is the default generated implementation

  /**
   * Flush buffer.
   *
   * @throws IOException Signals that an I/O exception has occurred.
   */
  @Override
  public void flushBuffer() throws IOException {
  }

  /**
   * Gets the buffer size.
   *
   * @return the buffer size
   */
  @Override
  public int getBufferSize() {
    return 0;
  }

  /**
   * Gets the character encoding.
   *
   * @return the character encoding
   */
  @Override
  public String getCharacterEncoding() {
    return encoding;
  }

  /**
   * Gets the locale.
   *
   * @return the locale
   */
  @Override
  public Locale getLocale() {
    return null;
  }

  /**
   * Gets the output stream.
   *
   * @return the output stream
   * @throws IOException Signals that an I/O exception has occurred.
   */
  @Override
  public ServletOutputStream getOutputStream() throws IOException {
    return null;
  }

  /**
   * Checks if is committed.
   *
   * @return true, if is committed
   */
  @Override
  public boolean isCommitted() {
    return false;
  }

  /**
   * Reset.
   */
  @Override
  public void reset() {
  }

  /**
   * Reset buffer.
   */
  @Override
  public void resetBuffer() {
  }

  /**
   * Sets the buffer size.
   *
   * @param size the new buffer size
   */
  @Override
  public void setBufferSize(int size) {
  }

  /**
   * Sets the character encoding.
   *
   * @param encoding the new character encoding
   */
  @Override
  public void setCharacterEncoding(String encoding) {
    this.encoding = encoding;
  }

  /**
   * Sets the content length.
   *
   * @param length the new content length
   */
  @Override
  public void setContentLength(int length) {
  }

  /**
   * Sets the locale.
   *
   * @param locale the new locale
   */
  @Override
  public void setLocale(Locale locale) {
  }

  /**
   * Adds the cookie.
   *
   * @param cookie the cookie
   */
  @Override
  public void addCookie(Cookie cookie) {
  }

  /**
   * Adds the date header.
   *
   * @param name the name
   * @param date the date
   */
  @Override
  public void addDateHeader(String name, long date) {
  }

  /**
   * Adds the header.
   *
   * @param name the name
   * @param value the value
   */
  @Override
  public void addHeader(String name, String value) {
  }

  /**
   * Adds the int header.
   *
   * @param name the name
   * @param value the value
   */
  @Override
  public void addIntHeader(String name, int value) {
  }

  /**
   * Contains header.
   *
   * @param name the name
   * @return true, if successful
   */
  @Override
  public boolean containsHeader(String name) {
    return false;
  }

  /**
   * Encode redirect URL.
   *
   * @param url the url
   * @return the string
   */
  @Override
  public String encodeRedirectURL(String url) {
    return null;
  }

  /**
   * Encode redirect url.
   *
   * @param url the url
   * @return the string
   */
  @Deprecated
  @Override
  public String encodeRedirectUrl(String url) {
    return null;
  }

  /**
   * Encode URL.
   *
   * @param url the url
   * @return the string
   */
  @Override
  public String encodeURL(String url) {
    return null;
  }

  /**
   * Encode url.
   *
   * @param url the url
   * @return the string
   */
  @Deprecated
  @Override
  public String encodeUrl(String url) {
    return null;
  }

  /**
   * Send error.
   *
   * @param statusCode the status code
   * @throws IOException Signals that an I/O exception has occurred.
   */
  @Override
  public void sendError(int statusCode) throws IOException {
  }

  /**
   * Send error.
   *
   * @param statusCode the status code
   * @param message the message
   * @throws IOException Signals that an I/O exception has occurred.
   */
  @Override
  public void sendError(int statusCode, String message) throws IOException {
  }

  /**
   * Send redirect.
   *
   * @param url the url
   * @throws IOException Signals that an I/O exception has occurred.
   */
  @Override
  public void sendRedirect(String url) throws IOException {
  }

  /**
   * Sets the date header.
   *
   * @param name the name
   * @param date the date
   */
  @Override
  public void setDateHeader(String name, long date) {
  }

  /**
   * Sets the header.
   *
   * @param name the name
   * @param value the value
   */
  @Override
  public void setHeader(String name, String value) {
  }

  /**
   * Sets the int header.
   *
   * @param name the name
   * @param value the value
   */
  @Override
  public void setIntHeader(String name, int value) {
  }

  /**
   * Sets the status.
   *
   * @param statusCode the new status
   */
  @Override
  public void setStatus(int statusCode) {
  }

  /**
   * Sets the status.
   *
   * @param statusCode the status code
   * @param message the message
   */
  @Deprecated
  @Override
  public void setStatus(int statusCode, String message) {
  }

  /**
   * Sets the content length long.
   *
   * @param length the new content length long
   */
  // Servlet API 3.0 and 3.1 methods
  @Override
  public void setContentLengthLong(long length) {
  }

  /**
   * Gets the status.
   *
   * @return the status
   */
  @Override
  public int getStatus() {
    return 0;
  }

  /**
   * Gets the header.
   *
   * @param name the name
   * @return the header
   */
  @Override
  public String getHeader(String name) {
    return null;
  }

  /**
   * Gets the headers.
   *
   * @param name the name
   * @return the headers
   */
  @Override
  public Collection<String> getHeaders(String name) {
    return null;
  }

  /**
   * Gets the header names.
   *
   * @return the header names
   */
  @Override
  public Collection<String> getHeaderNames() {
    return null;
  }
}
