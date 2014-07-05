/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ATermoRelacionalTermoRelac extends PTermoRelac
{
    private PParenteses _parenteses_;
    private PSinalRelacional _sinalRelacional_;
    private PNegacao _negacao_;

    public ATermoRelacionalTermoRelac()
    {
        // Constructor
    }

    public ATermoRelacionalTermoRelac(
        @SuppressWarnings("hiding") PParenteses _parenteses_,
        @SuppressWarnings("hiding") PSinalRelacional _sinalRelacional_,
        @SuppressWarnings("hiding") PNegacao _negacao_)
    {
        // Constructor
        setParenteses(_parenteses_);

        setSinalRelacional(_sinalRelacional_);

        setNegacao(_negacao_);

    }

    @Override
    public Object clone()
    {
        return new ATermoRelacionalTermoRelac(
            cloneNode(this._parenteses_),
            cloneNode(this._sinalRelacional_),
            cloneNode(this._negacao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermoRelacionalTermoRelac(this);
    }

    public PParenteses getParenteses()
    {
        return this._parenteses_;
    }

    public void setParenteses(PParenteses node)
    {
        if(this._parenteses_ != null)
        {
            this._parenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenteses_ = node;
    }

    public PSinalRelacional getSinalRelacional()
    {
        return this._sinalRelacional_;
    }

    public void setSinalRelacional(PSinalRelacional node)
    {
        if(this._sinalRelacional_ != null)
        {
            this._sinalRelacional_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sinalRelacional_ = node;
    }

    public PNegacao getNegacao()
    {
        return this._negacao_;
    }

    public void setNegacao(PNegacao node)
    {
        if(this._negacao_ != null)
        {
            this._negacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._negacao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parenteses_)
            + toString(this._sinalRelacional_)
            + toString(this._negacao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parenteses_ == child)
        {
            this._parenteses_ = null;
            return;
        }

        if(this._sinalRelacional_ == child)
        {
            this._sinalRelacional_ = null;
            return;
        }

        if(this._negacao_ == child)
        {
            this._negacao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parenteses_ == oldChild)
        {
            setParenteses((PParenteses) newChild);
            return;
        }

        if(this._sinalRelacional_ == oldChild)
        {
            setSinalRelacional((PSinalRelacional) newChild);
            return;
        }

        if(this._negacao_ == oldChild)
        {
            setNegacao((PNegacao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}