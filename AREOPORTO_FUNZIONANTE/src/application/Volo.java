package application;

import java.time.*;
import java.util.Date;

	public class Volo 
	{
		String areoportoPartenza,areoportoArrivo;
		Integer code,numeroPosti;
		double costoVolo;
		Date DataVolo;
		LocalTime timePartenza;//LocalTime.of(20, 30);
		LocalTime timeArrivo;
		
		public Volo() {}
		
		public Volo(String areoportoPartenza,String areoportoArrivo,Integer numeroPosti,double costoVolo,Date DataVolo,int oraPartenza,int minutiPartenza,int oraArrivo,int minutiArrivo)
		{
			this.areoportoPartenza=areoportoPartenza;
			this.areoportoArrivo=areoportoArrivo;
			this.numeroPosti=numeroPosti;
			this.costoVolo=costoVolo;
			this.DataVolo=DataVolo;
			timePartenza=LocalTime.of(oraPartenza, minutiPartenza);
			timeArrivo=LocalTime.of(oraArrivo,minutiArrivo);
		}
		
		public Volo(Volo v)	
		{
			this.areoportoPartenza=v.areoportoPartenza;
			this.areoportoArrivo=v.areoportoArrivo;
			this.code=v.code;
			this.numeroPosti=v.numeroPosti;
			this.costoVolo=v.costoVolo;
			this.DataVolo=v.DataVolo;
			timePartenza=v.timePartenza;
			timeArrivo=v.timeArrivo;
		}

		public String getAreoportoPartenza() 
		{
			return areoportoPartenza;
		}

		public void setAreoportoPartenza(String areoportoPartenza) 
		{
			this.areoportoPartenza = areoportoPartenza;
		}

		public String getAreoportoArrivo() 
		{
			return areoportoArrivo;
		}

		public void setAreoportoArrivo(String areoportoArrivo) 
		{
			this.areoportoArrivo = areoportoArrivo;
		}

		public Integer getCode() 
		{
			return code;
		}

		public void setCode(Integer code) 
		{
			this.code = code;
		}

		public Integer getNumeroPosti() 
		{
			return numeroPosti;
		}

		public void setNumeroPosti(Integer numeroPosti) 
		{
			this.numeroPosti = numeroPosti;
		}

		public double getCostoVolo() 
		{
			return costoVolo;
		}

		public void setCostoVolo(double costoVolo) 
		{
			this.costoVolo = costoVolo;
		}

		public Date getDataVolo() 
		{
			return DataVolo;
		}

		public void setDataVolo(Date dataVolo) 
		{
			DataVolo = dataVolo;
		}

		public LocalTime getTimePartenza() 
		{
			return timePartenza;
		}

		public void setTimePartenza(LocalTime timePartenza) 
		{
			this.timePartenza = timePartenza;
		}

		public LocalTime getTimeArrivo() 
		{
			return timeArrivo;
		}

		public void setTimeArrivo(LocalTime timeArrivo) 
		{
			this.timeArrivo = timeArrivo;
		}
		
		public Volo Clone() throws CloneNotSupportedException
		{
			Volo v= (Volo) super.clone();
			return v;
		}

		@Override
		public String toString() {
			return "Volo [areoportoPartenza=" + areoportoPartenza + ", areoportoArrivo=" + areoportoArrivo + ", code="
					+ code + ", numeroPosti=" + numeroPosti + ", costoVolo=" + costoVolo + ", DataVolo=" + DataVolo
					+ ", timePartenza=" + timePartenza + ", timeArrivo=" + timeArrivo + "]";
		}
		
	}
