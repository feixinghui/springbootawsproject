package springbootawsproject.web.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.context.i18n.LocaleContextHolder;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Created by xinghui on 5/1/17.
 */
@Service
public class i18NService {

    /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(i18NService.class);
    @Autowired
    private MessageSource messageSource;

      /**
      * Returns a message for the given message id and the default locale in the session context
       * @param messageId The key to the messages resource file
       **/
      public String getMessage(String messageId) {
              LOG.info("Returning i18n text for messageId {}", messageId);
              Locale locale = LocaleContextHolder.getLocale();
              return getMessage(messageId, locale);
          }
    /**
      * Returns a messsage for the given message id and locale
     * @param messageId The key to the messages resource file
     * @param locale The Locale
     **/
    public String getMessage(String messageId, Locale locale) {
        return messageSource.getMessage(messageId, null, locale);
    }

}
