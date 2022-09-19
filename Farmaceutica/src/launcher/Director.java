package launcher;
import productos.*;
import builder.*;
import java.util.ArrayList;

/**
 *
 * @author alejonba0498
 */
public class Director {

    public ArrayList getProductoColombia() {

        ArrayList listaProductosColombia = new ArrayList();

        AmpolletasCovid ac = new AmpolletasCovid();
        AmpolletasInfluenza ai = new AmpolletasInfluenza();
        JarabePurgante jp = new JarabePurgante();
        JarabeTos jt = new JarabeTos();
        JeringaMedico jm = new JeringaMedico();
        JeringaVeterinario jv = new JeringaVeterinario();
        PastillasCabeza pc = new PastillasCabeza();
        PastillasGarganta pg = new PastillasGarganta();

        ac.reset();
        ai.reset();
        jp.reset();
        jt.reset();
        jm.reset();
        jv.reset();
        pc.reset();
        pg.reset();

        ac.getProducto().setDescripcion("Ampolleta Covid Colombia");
        ac.getProducto().setColor("Color blanco para Colombia");
        ac.getProducto().setMarca("Sinovac");
        ac.putEmbaseVidrio();
        ac.putLogo();
        listaProductosColombia.add(ac);

        ai.getProducto().setDescripcion("Ampolleta influenza para Colombia");
        ai.getProducto().setColor("Color Azul para Colombia");
        ai.getProducto().setMarca("Influenza");
        ai.putEmbaseVidrio();
        ai.putLogo();
        listaProductosColombia.add(ai);

        jp.getProducto().setDescripcion("Purgante para Colombia");
        jp.getProducto().setColor("Color rojo para Colombia");
        jp.getProducto().setMarca("purgantol");
        jp.embasePlastico();
        jp.putLogo();
        listaProductosColombia.add(jp);

        jt.getProducto().setDescripcion("Jarabe Tos para Colombia");
        jt.getProducto().setColor("Color café para Colombia");
        jt.getProducto().setMarca("Mieltertos");
        jt.embasePlastico();
        jt.putLogo();
        listaProductosColombia.add(jt);

        jm.getProducto().setDescripcion("Jeringa de Medicos para Colombia");
        jm.getProducto().setColor("Color blanca para Colombia");
        jm.getProducto().setMarca("Intraven");
        jm.putAguja();
        jm.putLogo();
        listaProductosColombia.add(jm);

        jv.getProducto().setDescripcion("Jeringa de Veterinarios para Colombia");
        jv.getProducto().setColor("Color Amarillo para Colombia");
        jv.getProducto().setMarca("Nipro");
        jv.putAguja();
        jv.putLogo();
        listaProductosColombia.add(jv);

        pc.getProducto().setDescripcion("Pastillas de la cabeza para Colombia");
        pc.getProducto().setColor("Color roja para Colombia");
        pc.getProducto().setMarca("Advil");
        pc.putBlister();
        pc.putLogo();
        listaProductosColombia.add(pc);

        pg.getProducto().setDescripcion("Pastillas de la garganta para Colombia");
        pg.getProducto().setColor("Color verde para Colombia");
        pg.getProducto().setMarca("Noraver");
        pg.putBlister();
        pg.putLogo();
        listaProductosColombia.add(pg);

        return listaProductosColombia;
    }

    public ArrayList getProductoBolivia() {

        ArrayList listaProductosBolivia = new ArrayList();

        AmpolletasCovid ac = new AmpolletasCovid();
        AmpolletasInfluenza ai = new AmpolletasInfluenza();
        JarabePurgante jp = new JarabePurgante();
        JarabeTos jt = new JarabeTos();
        JeringaMedico jm = new JeringaMedico();
        JeringaVeterinario jv = new JeringaVeterinario();
        PastillasCabeza pc = new PastillasCabeza();
        PastillasGarganta pg = new PastillasGarganta();

        ac.reset();
        ai.reset();
        jp.reset();
        jt.reset();
        jm.reset();
        jv.reset();
        pc.reset();
        pg.reset();
        //--------------------------
        ac.getProducto().setDescripcion("Ampolleta Covid Bolivia");
        ac.getProducto().setColor("Color blanco para Bolivia");
        ac.getProducto().setMarca("Sinovac");
        ac.putEmbaseVidrio();
        ac.putLogo();
        listaProductosBolivia.add(ac);

        ai.getProducto().setDescripcion("Ampolleta influenza para Bolivia");
        ai.getProducto().setColor("Color Azul para Bolivia");
        ai.getProducto().setMarca("Influenza");
        ai.putEmbaseVidrio();
        ai.putLogo();
        listaProductosBolivia.add(ai);

        jp.getProducto().setDescripcion("Purgante para Bolivia");
        jp.getProducto().setColor("Color rojo para Bolivia");
        jp.getProducto().setMarca("purgantolito");
        jp.embasePlastico();
        jp.putLogo();
        listaProductosBolivia.add(jp);

        jt.getProducto().setDescripcion("Jarabe Tos para Bolivia");
        jt.getProducto().setColor("Color café para Bolivia");
        jt.getProducto().setMarca("Mieltertos");
        jt.embasePlastico();
        jt.putLogo();
        listaProductosBolivia.add(jt);

        jm.getProducto().setDescripcion("Jeringa de Medicos para Bolivia");
        jm.getProducto().setColor("Color blanca para Bolivia");
        jm.getProducto().setMarca("Intraven");
        jm.putAguja();
        jm.putLogo();
        listaProductosBolivia.add(jm);

        jv.getProducto().setDescripcion("Jeringa de Veterinarios para Bolivia");
        jv.getProducto().setColor("Color Amarillo para Bolivia");
        jv.getProducto().setMarca("Nipro");
        jv.putAguja();
        jv.putLogo();
        listaProductosBolivia.add(jv);

        pc.getProducto().setDescripcion("Pastillas de la cabeza para Bolivia");
        pc.getProducto().setColor("Color roja para Bolivia");
        pc.getProducto().setMarca("Advil");
        pc.putBlister();
        pc.putLogo();
        listaProductosBolivia.add(pc);

        pg.getProducto().setDescripcion("Pastillas de la garganta para Bolivia");
        pg.getProducto().setColor("Color verde para Bolivia");
        pg.getProducto().setMarca("Noraver");
        pg.putBlister();
        pg.putLogo();
        listaProductosBolivia.add(pg);
        return listaProductosBolivia;
    }

    public ArrayList getProductoArgentina() {
        ArrayList listaProductosArgentina = new ArrayList();

        AmpolletasCovid ac = new AmpolletasCovid();
        AmpolletasInfluenza ai = new AmpolletasInfluenza();
        JarabePurgante jp = new JarabePurgante();
        JarabeTos jt = new JarabeTos();
        JeringaMedico jm = new JeringaMedico();
        JeringaVeterinario jv = new JeringaVeterinario();
        PastillasCabeza pc = new PastillasCabeza();
        PastillasGarganta pg = new PastillasGarganta();

        ac.reset();
        ai.reset();
        jp.reset();
        jt.reset();
        jm.reset();
        jv.reset();
        pc.reset();
        pg.reset();

        ac.getProducto().setDescripcion("Ampolleta Covid Argentina");
        ac.getProducto().setColor("Color blanco para Argentina");
        ac.getProducto().setMarca("Sinovac");
        ac.putEmbaseVidrio();
        ac.putLogo();
        listaProductosArgentina.add(ac);

        ai.getProducto().setDescripcion("Ampolleta influenza para Argentina");
        ai.getProducto().setColor("Color Azul para Argentina");
        ai.getProducto().setMarca("Influenza");
        ai.putEmbaseVidrio();
        ai.putLogo();
        listaProductosArgentina.add(ai);

        jp.getProducto().setDescripcion("Purgante para Argentina");
        jp.getProducto().setColor("Color rojo para Argentina");
        jp.getProducto().setMarca("purgantol");
        jp.embasePlastico();
        jp.putLogo();
        listaProductosArgentina.add(jp);

        jt.getProducto().setDescripcion("Jarabe Tos para Argentina");
        jt.getProducto().setColor("Color café para Argentina");
        jt.getProducto().setMarca("Mieltertos");
        jt.embasePlastico();
        jt.putLogo();
        listaProductosArgentina.add(jt);

        jm.getProducto().setDescripcion("Jeringa de Medicos para Argentina");
        jm.getProducto().setColor("Color blanca para Argentina");
        jm.getProducto().setMarca("Intraven");
        jm.putAguja();
        jm.putLogo();
        listaProductosArgentina.add(jm);

        jv.getProducto().setDescripcion("Jeringa de Veterinarios para Argentina");
        jv.getProducto().setColor("Color Amarillo para Argentina");
        jv.getProducto().setMarca("Nipro");
        jv.putAguja();
        jv.putLogo();
        listaProductosArgentina.add(jv);

        pc.getProducto().setDescripcion("Pastillas de la cabeza para Argentina");
        pc.getProducto().setColor("Color roja para Argentina");
        pc.getProducto().setMarca("Advil");
        pc.putBlister();
        pc.putLogo();
        listaProductosArgentina.add(pc);

        pg.getProducto().setDescripcion("Pastillas de la garganta para Argentina");
        pg.getProducto().setColor("Color verde para Argentina");
        pg.getProducto().setMarca("Noraver");
        pg.putBlister();
        pg.putLogo();
        listaProductosArgentina.add(pg);

        return listaProductosArgentina;
    }

}
