package cn.dwt.builder;



/**
 * [一句话描述该类的功能]
 *
 * @author : [Sammy]
 * @version : [v1.0]
 * @createTime : [2023/9/15 09:54]
 */
public class ResourcePoolConfig {
	private String name;
	private int maxTotal;
	private int maxIdle;
	private int minIdle;

	public ResourcePoolConfig(Buildernew buildernew) {
		this.name = buildernew.name;
		this.maxTotal = buildernew.maxTotal;
		this.minIdle = buildernew.minIdle;
		this.maxIdle = buildernew.maxIdle;
	}

	static class Buildernew {
		private static final int DEFAULT_MAX_TOTAL = 8;
		private static final int DEFAULT_MAX_IDLE = 8;
		private static final int DEFAULT_MIN_IDLE = 0;

		private String name;
		private int maxTotal = DEFAULT_MAX_TOTAL;
		private int maxIdle = DEFAULT_MAX_IDLE;
		private int minIdle = DEFAULT_MIN_IDLE;

		public ResourcePoolConfig build() {
			if(name.equals("")){
				throw new IllegalArgumentException("...");
			}
			if(maxIdle >maxTotal){
				throw new IllegalArgumentException("...");
			}
			if(minIdle >maxTotal ||minIdle >maxIdle){
				throw new IllegalArgumentException("...");
			}
			return new ResourcePoolConfig(this);
			}

		public Buildernew setMaxTotal(int maxTotal) {
			if (maxTotal <= 0) {
				throw new IllegalArgumentException("...");
			}
			this.maxTotal = maxTotal;
			return this;
		}
	}


}



