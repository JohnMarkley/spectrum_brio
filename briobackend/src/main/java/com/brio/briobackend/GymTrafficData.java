@Component
public class GymTrafficData implements CommandLineRunner {

    private final GymTrafficRepository repository;

    @Autowired
    public DatabaseLoader(GymTrafficRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new GymTraffic(06.30.00, 27, "busy"));
    }
}