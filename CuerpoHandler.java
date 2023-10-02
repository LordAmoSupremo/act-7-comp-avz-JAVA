package tagpersonalizados;

import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import jakarta.servlet.jsp.JspException;

import java.io.IOException;
import java.time.LocalTime;

public class CuerpoHandler extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        try {
            if (getJspBody() != null) {
                // Obtener el contenido del cuerpo
                String bodyContent = getJspBody().toString();

                // Obtener la hora actual
                LocalTime currentTime = LocalTime.now();

                // Mostrar el contenido del cuerpo y la hora actual
                getJspContext().getOut().write("Contenido del cuerpo: " + bodyContent + "<br/>");
                getJspContext().getOut().write("Hora actual: " + currentTime.toString());
            }
        } catch (IOException e) {
            throw new JspException("Error al escribir en el JSP", e);
        }
    }
}
