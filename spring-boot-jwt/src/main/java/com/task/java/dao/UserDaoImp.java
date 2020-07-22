/*
 * package com.task.java.dao;
 * 
 * import java.util.List; import java.util.Optional;
 * 
 * import org.apache.logging.log4j.LogManager; import
 * org.apache.logging.log4j.Logger; import org.hibernate.Session; import
 * org.hibernate.SessionFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.data.domain.Example; import
 * org.springframework.data.domain.Page; import
 * org.springframework.data.domain.Pageable; import
 * org.springframework.data.domain.Sort; import
 * org.springframework.stereotype.Repository;
 * 
 * import com.task.java.model.UserDetailsModel; import
 * com.task.java.model.UserModel;
 * 
 * @Repository("userDao") public class UserDaoImp implements UserDao {
 * 
 * private static final Logger logger = LogManager.getLogger(UserDaoImp.class);
 * 
 * @Autowired private SessionFactory sessionFactory;
 * 
 * @Override public void deleteAllInBatch() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void deleteInBatch(Iterable<UserModel> arg0) { // TODO
 * Auto-generated method stub
 * 
 * }
 * 
 * @Override public List<UserModel> findAll() { // TODO Auto-generated method
 * stub return null; }
 * 
 * @Override public List<UserModel> findAll(Sort arg0) { // TODO Auto-generated
 * method stub return null; }
 * 
 * @Override public <S extends UserModel> List<S> findAll(Example<S> arg0) { //
 * TODO Auto-generated method stub return null; }
 * 
 * @Override public <S extends UserModel> List<S> findAll(Example<S> arg0, Sort
 * arg1) { // TODO Auto-generated method stub return null; }
 * 
 * @Override public List<UserModel> findAllById(Iterable<Integer> arg0) { //
 * TODO Auto-generated method stub return null; }
 * 
 * @Override public void flush() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public UserModel getOne(Integer arg0) { // TODO Auto-generated
 * method stub return null; }
 * 
 * @Override public <S extends UserModel> List<S> saveAll(Iterable<S> arg0) { //
 * TODO Auto-generated method stub return null; }
 * 
 * @Override public <S extends UserModel> S saveAndFlush(S arg0) { // TODO
 * Auto-generated method stub return null; }
 * 
 * @Override public Page<UserModel> findAll(Pageable arg0) { // TODO
 * Auto-generated method stub return null; }
 * 
 * @Override public long count() { // TODO Auto-generated method stub return 0;
 * }
 * 
 * @Override public void delete(UserModel arg0) { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * @Override public void deleteAll() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void deleteAll(Iterable<? extends UserModel> arg0) { // TODO
 * Auto-generated method stub
 * 
 * }
 * 
 * @Override public void deleteById(Integer arg0) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * @Override public boolean existsById(Integer arg0) { // TODO Auto-generated
 * method stub return false; }
 * 
 * @Override public Optional<UserModel> findById(Integer arg0) { // TODO
 * Auto-generated method stub return null; }
 * 
 * 
 * @Override public <S extends UserModel> S savetoDb(UserModel userModel) {
 * UserModel savetodb=null; // TODO Auto-generated method stub
 * savetodb=userDao.save(userModel); return null; }
 * 
 * 
 * @Override public <S extends UserModel> long count(Example<S> arg0) { // TODO
 * Auto-generated method stub return 0; }
 * 
 * @Override public <S extends UserModel> boolean exists(Example<S> arg0) { //
 * TODO Auto-generated method stub return false; }
 * 
 * @Override public <S extends UserModel> Page<S> findAll(Example<S> arg0,
 * Pageable arg1) { // TODO Auto-generated method stub return null; }
 * 
 * @Override public <S extends UserModel> Optional<S> findOne(Example<S> arg0) {
 * // TODO Auto-generated method stub
 * 
 * return null; }
 * 
 * @Override public UserModel findByUsername(String username) { // TODO
 * Auto-generated method stub return null; }
 * 
 * 
 * @Override public int savetoDb(UserModel userModel) { // TODOAuto-generated
 * method stub logger.info("----- saveUserDetailsModel() OMDaoImp -----");
 * Session session = null; int i=0; try { session =
 * sessionFactory.getCurrentSession(); i=(int)session.save(userModel);
 * System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiii"); } catch (Exception e)
 * { e.printStackTrace();
 * logger.error("----- saveUserDetailsModel() OMDaoImp -----"); } finally {
 * if(session != null && session.isOpen()) { // session.close(); // session =
 * null; } } return i; }
 * 
 * 
 * @Override public UserDetailsModel save(UserDetailsModel userDetailsModel) {
 * // TODO Auto-generated method stub return null; }
 * 
 * @Override public <S extends UserModel> S save(S arg0) { // TODO
 * Auto-generated method stub return null; }
 * 
 * }
 */