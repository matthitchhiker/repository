package com.matthew.util;

public class SpecSearchCriteria {

    private String id;
    private SearchOperation idOperation;
    private Object idValue;
    private String name;
    private SearchOperation nameOperation;
    private Object nameValue;
    private SearchOperation operation;

    public SpecSearchCriteria() {

    }

    public SpecSearchCriteria(final String id, final SearchOperation idOperation, final Object idValue, final String name, 
    		final SearchOperation nameOperation, final Object nameValue, final SearchOperation operation) {
        super();
        this.id = id;
        this.idOperation = idOperation;
        this.idValue = idValue;
        this.name = name;
        this.nameOperation = nameOperation;
        this.nameValue = nameValue;
        this.operation = operation;
        
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SearchOperation getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(SearchOperation idOperation) {
		this.idOperation = idOperation;
	}

	public Object getIdValue() {
		return idValue;
	}

	public void setIdValue(Object idValue) {
		this.idValue = idValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SearchOperation getNameOperation() {
		return nameOperation;
	}

	public void setNameOperation(SearchOperation nameOperation) {
		this.nameOperation = nameOperation;
	}

	public Object getNameValue() {
		return nameValue;
	}

	public void setNameValue(Object nameValue) {
		this.nameValue = nameValue;
	}

	public SearchOperation getOperation() {
		return operation;
	}

	public void setOperation(SearchOperation operation) {
		this.operation = operation;
	}
    
}