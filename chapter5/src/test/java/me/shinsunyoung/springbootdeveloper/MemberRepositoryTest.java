@DataJpaTest
class MemberRepositoryTest{
    @Autowired
    MemberRepository memberRepository;
    
    @Sql("/insert-members.sql")
    @Test
    void getAllMembers(){
        List<Member> members = memberRepository.findAll();
        
        assertThat(members.size()).isEqualTo(3);
    }
}
