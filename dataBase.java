/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FASE1;

import Fase03.HashA;

/**
 *
 * @author dvpy4
 */
public class dataBase {
    
    
    HashA<Curso> Semestre1 = new HashA(4);
    HashA<Curso> Semestre2 = new HashA(4);
    HashA<Curso> Semestre3 = new HashA(4);
    HashA<Curso> Semestre4 = new HashA(4);
    HashA<Curso> Semestre5 = new HashA(4);
    HashA<Curso> Semestre6 = new HashA(4);
    HashA<Curso> Semestre7 = new HashA(4);
    HashA<Curso> Semestre8 = new HashA(4);
    HashA<Curso> Semestre9 = new HashA(4);
    HashA<Curso> Semestre10 = new HashA(4);

    Escuela Sis = new Escuela(1, "Escuela profesional de Ingenieria de Sistemas", 1);
    Curso TAL = new Curso(1234, 1, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Taller de lectura y redaccion", 15, 19, "01","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso MAT = new Curso(4567, 2, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Matematica", 12, 19, "02","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso PC = new Curso(2345, 3, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Pensamiento Computacional", 17, 6, "03","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso IIDS = new Curso(3456, 4, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Introduccion de ingenieria de sistemas", 15, 14, "04","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso MP = new Curso(5678, 5, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Metodologia de la programacion", 13, 15, "05","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");

    Curso Semestre_1[] = {TAL, MAT, PC, IIDS, MP};

    Curso TA = new Curso(6789, 1, Sis.getId_escuela(), Sis.getNombre_escuela(), 2, 1, 1, 'A', "Taller de Arte", 14, 16, "01","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso IP = new Curso(7891, 2, Sis.getId_escuela(), Sis.getNombre_escuela(), 2, 1, 1, 'A', "Identidad y peruanidad", 18, 16, "02","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso F = new Curso(8989, 3, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Fisica", 14, 14, "03","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso CAL = new Curso(8787, 4, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Calculo", 13, 14, "04","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso ED = new Curso(6556, 5, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Estructura discreta", 12, 16, "05","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso LPI = new Curso(4554, 6, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Lenguaje de programacion I", 14, 16, "06","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso Semestre_2[] = {TA, IP, F, CAL, ED, LPI};

    Curso TD = new Curso(6734, 1, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Taller de deporte", 12, 19, "01","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso THS = new Curso(4321, 2, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Taller de habilidades sociales", 16, 13, "02","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso TCL = new Curso(8965, 3, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Taller de coaching y liderazgo", 14, 19, "03","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso TFL = new Curso(7854, 4, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Taller de felicidad y libertad", 17, 14, "04","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso CI = new Curso(3956, 5, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Calculo Integral", 12, 11, "05","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso FITI = new Curso(5555, 6, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Fundamentos de tecnologias de la informacion", 15, 17, "06","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso LPII = new Curso(6666, 7, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Lenguaje de programacion II", 16, 13, "07","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso Semestre_3[] = {TD, THS, TCL, TFL, CI, FITI, LPII};

    Curso TAR = new Curso(7964, 1, Sis.getId_escuela(), Sis.getNombre_escuela(), 2, 1, 1, 'A', "Taller de Argumentacion", 11, 18, "01","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso RCE = new Curso(3164, 2, Sis.getId_escuela(), Sis.getNombre_escuela(), 2, 1, 1, 'A', "Responsabilidad ciudadana y ecologica", 14, 16, "02","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso FEM = new Curso(9137, 3, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Fisica: Electricidad y Magnetismo", 17, 19, "03","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso FSI = new Curso(6598, 4, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Fundamentos del sistema de informacion", 16, 15, "04","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso LPIII = new Curso(8712, 5, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Lenguaje de programacion III", 14, 15, "05","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso CRI = new Curso(5657, 6, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Computacion en red I", 13, 16, "06","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");

    Curso Semestre_4[] = {TAR, RCE, FEM, FSI, LPIII, CRI};

    Curso AED = new Curso(1111, 1, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Algoritmos y estructura de datos", 14, 18, "01","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso ADS = new Curso(2222, 2, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Analisis de Diseño de sistemas", 14, 14, "02","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso SIA = new Curso(3333, 3, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Sistemas de Informacion Administrativa", 16, 16, "03","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso EST = new Curso(4444, 4, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Estadistica", 13, 15, "04","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso CP = new Curso(7777, 5, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Computacion en Red II", 17, 14, "05","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso IHC = new Curso(8888, 6, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Interaccion Humano computador", 16, 19, "06","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso DAM = new Curso(9999, 7, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Diseño de aplicaciones moviles", 14, 15, "07","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso Semestre_5[] = {AED, ADS, SIA, EST, CP, IHC, DAM};

    Curso FE = new Curso(1112, 1, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Filosofia y Etica", 17, 18, "01","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso CRIII = new Curso(1113, 2, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Computacion en Red III", 19, 16, "01","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso GID = new Curso(1114, 3, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Gestion de Datos e Informacion", 17, 16, "01","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso ITF = new Curso(1115, 4, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Infraestructura de tecnologias de la informacion", 11, 16, "02","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso DA = new Curso(1116, 5, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Desarrollo de aplicaciones", 19, 18, "03","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso SIAII = new Curso(5657, 6, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Sistema de informacion II", 16, 16, "04","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso Semestre_6[] = {FE, CRIII, GID, ITF, DA, SIAII};

    Curso GDN = new Curso(1119, 1, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Gestion de procesos de negocio", 17, 19, "01","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso SO = new Curso(2223, 2, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Sistemas Operativos", 11, 15, "02","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso ISS = new Curso(3334, 3, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Ingeniera de Sistema y sociedad", 19, 19, "03","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso TM = new Curso(4445, 4, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Tecnologia Moviles", 16, 13, "04","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso TIMS = new Curso(7776, 5, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Testing: implementacion y mantenimiento de sistemas", 16, 14, "05","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso SI = new Curso(8887, 6, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Sistemas Inteligentes", 15, 18, "06","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso semestre_7[] = {GDN, SO, ISS, TM, TIMS, SI};

    Curso IN = new Curso(1122, 1, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Inteligencia de Negocio", 14, 15, "01","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso FPSI = new Curso(2233, 2, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Fundamentos de Proyectos de Sistemas de Informacion", 16, 17, "02","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso GSTI = new Curso(3344, 3, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Gestion de Sistemasy Tecnologia de Informacion", 14, 15, "03","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso GC = new Curso(4455, 4, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Gestion de Conocimiento", 16, 19, "04","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso IE = new Curso(7766, 5, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Innovacion y Emprendedurismo", 13, 17, "05","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso OP = new Curso(8877, 6, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Optimizacion de Operaciones", 14, 19, "02","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso Semestre_8[] = {IN, FPSI, GSTI, GC, IE, OP};

    Curso PPP = new Curso(1222, 1, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Practicas Pre-Profesionales", 16, 17, "01","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso III = new Curso(2333, 2, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Investigacion en Ingeniera I", 14, 15, "06","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso NE = new Curso(3444, 3, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Negocios Electronicos", 19, 18, "09","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso SINF = new Curso(4555, 4, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Seguridad Informatica", 14, 17, "05","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso GP = new Curso(7666, 5, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Gestion de Proyectos", 16, 13, "08","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso TE = new Curso(8777, 6, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Tecnologias Emergentes", 17, 19, "02","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso SIG = new Curso(9999, 7, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Sistema de gestion de calidad", 14, 18, "04","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso Semestre_9[] = {PPP, III, NE, SINF, GP, TE, SIG};

    Curso PESTI = new Curso(1111, 1, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Planeamiento Estratégico de Sistemas y Tecnologías de la Informacións", 14, 19, "01","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso ASTI = new Curso(2222, 2, Sis.getId_escuela(), Sis.getNombre_escuela(), 4, 1, 1, 'A', "Auditoría de Sistemas y Tecnologías de la Información", 15, 16, "02","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso IIII = new Curso(3333, 3, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Investigación en Ingeniería II", 17, 19, "03","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso PFC = new Curso(4444, 4, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Proyecto de Fin de Carrera", 16, 19, "04","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso PRE = new Curso(7777, 5, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Planeamiento de Recursos Empresariales", 17, 18, "05","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso BD = new Curso(8888, 6, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Big Data", 16, 19, "06","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso GRTI = new Curso(9999, 7, Sis.getId_escuela(), Sis.getNombre_escuela(), 3, 1, 1, 'A', "Gestión de Riesgos en Tecnologías de la Informacións", 14, 19, "07","L: 12:00-1:30 am MI: 9:00-11:00 am V: 6:00-8:00 pm","H501");
    Curso Semestre_10[] = {PESTI, ASTI, IIII, PFC, PRE, ED, GRTI};

    public dataBase() {
        for (int i = 0; i < Semestre_1.length; i++) {
            Semestre1.insert(Semestre_1[i].getId_curso(), Semestre_1[i]);
        }
        for (int i = 0; i < Semestre_2.length; i++) {
            Semestre2.insert(Semestre_2[i].getId_curso(), Semestre_2[i]);
        }
        for (int i = 0; i < Semestre_3.length; i++) {
            Semestre3.insert(Semestre_3[i].getId_curso(), Semestre_3[i]);
        }
        for (int i = 0; i < Semestre_4.length; i++) {
            Semestre4.insert(Semestre_4[i].getId_curso(), Semestre_4[i]);
        }
        for (int i = 0; i < Semestre_5.length; i++) {
            Semestre5.insert(Semestre_5[i].getId_curso(), Semestre_5[i]);
        }
        for (int i = 0; i < Semestre_6.length; i++) {
            Semestre6.insert(Semestre_6[i].getId_curso(), Semestre_6[i]);
        }
        for (int i = 0; i < semestre_7.length; i++) {
            Semestre7.insert(semestre_7[i].getId_curso(), semestre_7[i]);
        }
        for (int i = 0; i < Semestre_8.length; i++) {
            Semestre8.insert(Semestre_8[i].getId_curso(), Semestre_8[i]);
        }
        for (int i = 0; i < Semestre_9.length; i++) {
            Semestre9.insert(Semestre_9[i].getId_curso(), Semestre_9[i]);
        }
        for (int i = 0; i < Semestre_10.length; i++) {
            Semestre10.insert(Semestre_10[i].getId_curso(), Semestre_10[i]);
        }
    }

    public HashA<Curso> getSemestre1() {
        return Semestre1;
    }

    public HashA<Curso> getSemestre2() {
        return Semestre2;
    }

    public HashA<Curso> getSemestre3() {
        return Semestre3;
    }

    public HashA<Curso> getSemestre4() {
        return Semestre4;
    }

    public HashA<Curso> getSemestre5() {
        return Semestre5;
    }

    public HashA<Curso> getSemestre6() {
        return Semestre6;
    }

    public HashA<Curso> getSemestre7() {
        return Semestre7;
    }

    public HashA<Curso> getSemestre8() {
        return Semestre8;
    }

    public HashA<Curso> getSemestre9() {
        return Semestre9;
    }

    public HashA<Curso> getSemestre10() {
        return Semestre10;
    }

    public Escuela getSis() {
        return Sis;
    }

    public Curso getTAL() {
        return TAL;
    }

    public Curso getMAT() {
        return MAT;
    }

    public Curso getPC() {
        return PC;
    }

    public Curso getIIDS() {
        return IIDS;
    }

    public Curso getMP() {
        return MP;
    }

    public Curso[] getSemestre_1() {
        return Semestre_1;
    }

    public Curso getTA() {
        return TA;
    }

    public Curso getIP() {
        return IP;
    }

    public Curso getF() {
        return F;
    }

    public Curso getCAL() {
        return CAL;
    }

    public Curso getED() {
        return ED;
    }

    public Curso getLPI() {
        return LPI;
    }

    public Curso[] getSemestre_2() {
        return Semestre_2;
    }

    public Curso getTD() {
        return TD;
    }

    public Curso getTHS() {
        return THS;
    }

    public Curso getTCL() {
        return TCL;
    }

    public Curso getTFL() {
        return TFL;
    }

    public Curso getCI() {
        return CI;
    }

    public Curso getFITI() {
        return FITI;
    }

    public Curso getLPII() {
        return LPII;
    }

    public Curso[] getSemestre_3() {
        return Semestre_3;
    }

    public Curso getTAR() {
        return TAR;
    }

    public Curso getRCE() {
        return RCE;
    }

    public Curso getFEM() {
        return FEM;
    }

    public Curso getFSI() {
        return FSI;
    }

    public Curso getLPIII() {
        return LPIII;
    }

    public Curso getCRI() {
        return CRI;
    }

    public Curso[] getSemestre_4() {
        return Semestre_4;
    }

    public Curso getAED() {
        return AED;
    }

    public Curso getADS() {
        return ADS;
    }

    public Curso getSIA() {
        return SIA;
    }

    public Curso getEST() {
        return EST;
    }

    public Curso getCP() {
        return CP;
    }

    public Curso getIHC() {
        return IHC;
    }

    public Curso getDAM() {
        return DAM;
    }

    public Curso[] getSemestre_5() {
        return Semestre_5;
    }

    public Curso getFE() {
        return FE;
    }

    public Curso getCRIII() {
        return CRIII;
    }

    public Curso getGID() {
        return GID;
    }

    public Curso getITF() {
        return ITF;
    }

    public Curso getDA() {
        return DA;
    }

    public Curso getSIAII() {
        return SIAII;
    }

    public Curso[] getSemestre_6() {
        return Semestre_6;
    }

    public Curso getGDN() {
        return GDN;
    }

    public Curso getSO() {
        return SO;
    }

    public Curso getISS() {
        return ISS;
    }

    public Curso getTM() {
        return TM;
    }

    public Curso getTIMS() {
        return TIMS;
    }

    public Curso getSI() {
        return SI;
    }

    public Curso[] getSemestre_7() {
        return semestre_7;
    }

    public Curso getIN() {
        return IN;
    }

    public Curso getFPSI() {
        return FPSI;
    }

    public Curso getGSTI() {
        return GSTI;
    }

    public Curso getGC() {
        return GC;
    }

    public Curso getIE() {
        return IE;
    }

    public Curso getOP() {
        return OP;
    }

    public Curso[] getSemestre_8() {
        return Semestre_8;
    }

    public Curso getPPP() {
        return PPP;
    }

    public Curso getIII() {
        return III;
    }

    public Curso getNE() {
        return NE;
    }

    public Curso getSINF() {
        return SINF;
    }

    public Curso getGP() {
        return GP;
    }

    public Curso getTE() {
        return TE;
    }

    public Curso getSIG() {
        return SIG;
    }

    public Curso[] getSemestre_9() {
        return Semestre_9;
    }

    public Curso getPESTI() {
        return PESTI;
    }

    public Curso getASTI() {
        return ASTI;
    }

    public Curso getIIII() {
        return IIII;
    }

    public Curso getPFC() {
        return PFC;
    }

    public Curso getPRE() {
        return PRE;
    }

    public Curso getBD() {
        return BD;
    }

    public Curso getGRTI() {
        return GRTI;
    }

    public Curso[] getSemestre_10() {
        return Semestre_10;
    }
    
    
    
}
