package homework.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "simple", schema = "homework", catalog = "")
public class SimpleEntity {
    private int id;
    private String name;
    private Integer number;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "number")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleEntity that = (SimpleEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, number);
    }

    @Override
    public String toString() {
        return "SimpleEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Test
    public void test01() {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        String sql = "select version()";
        String result = (String) session.createNativeQuery(sql).getSingleResult();
        System.out.println(result);

        session.close();
        sessionFactory.close();
    }

    @Test
    public void test02() {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(SimpleEntity.class)
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        SimpleEntity thing = session.get(SimpleEntity.class, new Integer(1));
        System.out.println(thing.toString());

        session.close();
        sessionFactory.close();
    }

    @Test
    public void test03() {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(SimpleEntity.class)
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        SimpleEntity thing = session.load(SimpleEntity.class, new Integer(1));
        System.out.println(thing.toString());

        session.close();
        sessionFactory.close();
    }

    @Test
    public void test04() {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(SimpleEntity.class)
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        SimpleEntity thing = new SimpleEntity();
        thing.setName("thingNext");
        thing.setNumber(12);
        session.save(thing);


        int id = thing.getId();


        transaction.commit();
        System.out.println(thing.toString());

        session.close();
        sessionFactory.close();
    }

}