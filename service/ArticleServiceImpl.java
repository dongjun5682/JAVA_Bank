package service;

import java.util.ArrayList;
import java.util.HashMap;

import domain.ArticleBean;

public class ArticleServiceImpl implements ArticleService {
	private HashMap<String,ArticleBean> map;
	public ArticleServiceImpl() {
		map = new HashMap<>();
	}
	
	@Override
	public void creatWriting(int seq, String title, String content, String writer, String regDate) {
		ArticleBean article = new ArticleBean();
		seq = 1000;
		seq++;
		article.setSeq(seq);
	}

	@Override
	public ArrayList<ArticleBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ArticleBean> findByWriter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleBean findBySeq() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void countSeq() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateContent(int seq, String newContent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTitle(int seq, String newTitle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int seq) {
		// TODO Auto-generated method stub
		
	}

}
